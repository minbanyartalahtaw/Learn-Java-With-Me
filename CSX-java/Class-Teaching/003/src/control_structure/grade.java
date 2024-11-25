package control_structure;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int user_mark = input.nextInt();

        if (user_mark > 100 || user_mark < 0) {
            System.out.println("Error!!!!");
        } else if (user_mark >= 90) {
            System.out.println("Grade - A");
        } else if (user_mark >= 80) {
            System.out.println("Grade - B");
        } else if (user_mark >= 70) {
            System.out.println("Grade - C");
        } else {
            System.out.println("Grade - D");
        }

        input.close();
    }
};
