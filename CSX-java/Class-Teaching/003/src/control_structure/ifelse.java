package control_structure;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int user_age = input.nextInt();

        if (user_age < 19) {
            System.out.println("Teenager");
        } else if  (user_age < 30){
            System.out.println("Adult");
        } else {
            System.out.println("Adult Adult");
        }
        input.close();
    }
}
