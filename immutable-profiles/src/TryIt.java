import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());

        // p.setEmail("evil@example.com"); // no longer possible
        UserProfile p2 = new UserProfile.Builder("u2", "c@d.com")
                                .displayName("VeryLongName".repeat(20)) // gets trimmed
                                .marketingOptIn(true)
                                .build();
        System.out.println("DisplayName length: " + p2.getDisplayName().length());
    }
}
