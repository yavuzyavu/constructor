package SirinleCalis.sirin.Sirin1;

public class Abd2 {
    public static void main(String[] args) {
        String password = "Kanimiri66";

        String newPassword = password.length() > 8 ? ((password.startsWith("K")) ?
                "Valid" : "Invalid") : password.startsWith("i") ? "Valid" : "Invalid";

    }}