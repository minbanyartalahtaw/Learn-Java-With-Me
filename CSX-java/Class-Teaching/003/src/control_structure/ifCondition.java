package control_structure;
import java.util.Scanner;
public class ifCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int userInput = input.nextInt();

        if (userInput % 2 == 0) {
            System.out.println(userInput + " is Even Number.");
        } else {
            System.out.println(userInput + " is Odd number");
        }
        input.close();
    }
}
