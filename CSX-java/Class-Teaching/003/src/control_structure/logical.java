package control_structure;

import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digits pin : ");
        int pin_number = input.nextInt();

        System.out.print("Enter the amount : ");
        int amount = input.nextInt();

        if (pin_number == 1234 && amount == 100) {
            System.out.println("Valid !");
        } else {
            System.out.println("Error !");
        }
        input.close();
    }
}
