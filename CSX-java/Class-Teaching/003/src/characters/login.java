package characters;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = new String("1234");

        System.out.print("Enter a password : ");
        String userInput = input.nextLine();

        if (password.equals(userInput)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }
}
