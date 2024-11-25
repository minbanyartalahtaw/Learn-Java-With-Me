/*
Name - Min Banyar Tala Htaw
ID - 6715168
SEC - 2
 */

package classEx2;
import java.util.Scanner;
public class PasswordChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (password.length() >= 8) {
            int upperCount = 0;
            int digitCount = 0;
            int specialCharacterCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (Character.isUpperCase(character)) {
                    upperCount++;
                } else if (Character.isDigit(character)) {
                    digitCount++;
                } else if (!Character.isLetterOrDigit(character)) {
                    specialCharacterCount++;
                }
            }
            if (upperCount == 0 || digitCount == 0 || specialCharacterCount == 0) {
                System.out.println("Password must contain at least one uppercase letter, one digit, and one special character.");
                return;
            }
            System.out.println("Password format is valid.");
        }
        else {
            System.out.println("Password must be at least 8 characters long.");
        };
    }
};
