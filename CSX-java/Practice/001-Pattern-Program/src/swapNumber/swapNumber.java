package swapNumber;
import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a = sc.nextInt();

        System.out.print("Enter the b : ");
        int b = sc.nextInt();

        System.out.println("Before swapping, a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
