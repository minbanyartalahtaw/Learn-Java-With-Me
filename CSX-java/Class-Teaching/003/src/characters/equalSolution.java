package characters;
import java.util.Scanner;
public class equalSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Min Banyar";

        System.out.print("Enter your name : ");
        String userInput = input.nextLine();
        if (userInput.equals(name)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }
}
