import java.util.Scanner;

/* User-defined exception */
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {

    static void validatePassword(String password) throws InvalidPasswordException {

        StringBuilder errors = new StringBuilder();
        String specialChars = "@*!{}()[]";

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        /* 1) Length check */
        if (password.length() < 8) {
            errors.append("- Password must be at least 8 characters long\n");
        }

        /* Character checks */
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else if (specialChars.indexOf(ch) != -1)
                hasSpecial = true;
            else
                errors.append("- Password contains invalid character: ").append(ch).append("\n");
        }

        /* 2) Alphanumeric check */
        if (!(hasLower || hasUpper) || !hasDigit) {
            errors.append("- Password must be alphanumeric (letters and digits)\n");
        }

        /* 3) Lowercase check */
        if (!hasLower) {
            errors.append("- Password must contain at least one lowercase letter\n");
        }

        /* 4) Uppercase check */
        if (!hasUpper) {
            errors.append("- Password must contain at least one uppercase letter\n");
        }

        /* 5) Special character check */
        if (!hasSpecial) {
            errors.append("- Password must contain at least one special character (@,*,!,{,},(,),[,])\n");
        }

        /* 6) No same characters consecutively (simple version) */
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                errors.append("- Password must not contain same characters consecutively\n");
                break;
            }
        }

        /* Throw exception if any errors exist */
        if (errors.length() > 0) {
            throw new InvalidPasswordException(errors.toString());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("\nPassword is VALID ");
        } catch (InvalidPasswordException e) {
            System.out.println("\nPassword is INVALID ");
            System.out.println("Problems found:");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
