package classEx1;

import java.util.Scanner;

public class FindHollowSphereVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the outer radius : ");
        double outerRadius = input.nextDouble();
        System.out.print("Enter the inner radius : ");
        double innerRadius = input.nextDouble();
        double hollowSphereVolume = (4.0 / 3.0) * Math.PI * (outerRadius * outerRadius * outerRadius) - (4.0 / 3.0) * Math.PI * (innerRadius * innerRadius * innerRadius);
        System.out.format("Hollow sphere volume: %.2f", hollowSphereVolume);
    }
}
