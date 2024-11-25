package week002;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = myInput.nextInt();

        System.out.print("Enter second number : ");
        int num2 = myInput.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);

        int division = num1 / num2;
        System.out.println("The division is : " + division);

        int remainder = num1 % num2;
        System.out.println("The remainder is : " + remainder);

        int multiplication = num1 * num2;
        System.out.println("The multiplication is : " + multiplication);

        int subtraction = num1 - num2;
        System.out.println("The subtraction is : " + subtraction);
        myInput.close();
    }
}
