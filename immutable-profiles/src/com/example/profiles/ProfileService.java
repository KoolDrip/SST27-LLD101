package com.example.profiles;

public class ProfileService {

    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile createWithDisplayName(String id, String email, String displayName) {
        return new UserProfile.Builder(id, email)
                .displayName(displayName)
                .build();
    }
}
