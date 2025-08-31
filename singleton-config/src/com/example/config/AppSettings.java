package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public final class AppSettings implements Serializable {
    private static final long serialVersionUID = 1L;

    // volatile for safe publication
    private static volatile AppSettings instance;
    private static boolean instanceCreated = false;

    private final Properties props = new Properties();

    // private constructor
    private AppSettings() {
        if (instanceCreated) {
            throw new IllegalStateException("Use getInstance(), not reflection");
        }
        instanceCreated = true;
    }

    // lazy, thread-safe singleton (double-checked locking)
    public static AppSettings getInstance() {
        if (instance == null) {
            synchronized (AppSettings.class) {
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }
        return instance;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    // ensure singleton on deserialization
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
