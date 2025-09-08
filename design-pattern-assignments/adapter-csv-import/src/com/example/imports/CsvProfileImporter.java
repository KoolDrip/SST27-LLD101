package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = Objects.requireNonNull(reader);
        this.service = Objects.requireNonNull(service);
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int imported = 0;

        for (String[] row : rows) {
            if (row.length < 3) {
                System.err.println("Skipping row (not enough columns): " + String.join(",", row));
                continue;
            }

            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();

            if (id.isEmpty() || email.isEmpty()) {
                System.err.println("Skipping row (missing id/email): " + String.join(",", row));
                continue;
            }

            try {
                service.createProfile(id, email, displayName);
                imported++;
            } catch (Exception e) {
                System.err.println("Skipping row (invalid data): " + String.join(",", row) + " — " + e.getMessage());
            }
        }

        return imported;
    }
}
