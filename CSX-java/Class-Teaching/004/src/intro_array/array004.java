package intro_array;
import java.util.ArrayList;

public class array004 {
    public static int max(int[] num_data) {
        int maxNumber = num_data[0];
        for (int i = 0; i < num_data.length;i++) {
            if (num_data[i] > maxNumber) {
                maxNumber = num_data[i];
            }
        }
        return maxNumber;
    }

    public static int min(int[] num_data) {
        int minNumber = num_data[0];
        for (int i = 0; i < num_data.length;i++) {
            if (num_data[i] < minNumber) {
                minNumber = num_data[i];
            }
        }
        return minNumber;
    }

    public static int sum(int[] num_data) {
        int total = 0;
        for (int num : num_data) {
            total += num;
        }
        return total;
    }

    public static int mean(int[] num_data) {
        int total = 0;
        for (int num : num_data) {
            total += num;
        }
        return total / num_data.length;
    }

    // This line of code is important
    public static ArrayList<Integer> even(int[] num_data) {
        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        for (int i = 0; i < num_data.length;i++) {
            if (num_data[i] % 2 == 0 ) {
                evenNumber.add(num_data[i]);
            };
        };
        return evenNumber;
    };

    // This line of code is important too
    public static ArrayList<String> identify(int[] num_data) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < num_data.length;i++) {
            if (num_data[i] % 2 == 0 ) {
                result.add("Even");
            } else {
                result.add("Odd");
            }
        };
        return result;
    }

    //reverse the array
    public static ArrayList<Integer> reverse(int[] num_data) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = num_data.length - 1; i > -1;i--) {
            result.add(num_data[i]);
        }
        return result;
    }




    public static void main(String[] args) {
        int[] num_data = {100,469,782,605,243,712,402};
        System.out.println("The max number is : " + max(num_data));
        System.out.println("The min number is : " + min(num_data));
        System.out.println("The sum number is : " + sum(num_data));
        System.out.println("The even number is : " + even(num_data));
        System.out.println("The identify number is : " + identify(num_data));
        System.out.println("The reverse number is : " + reverse(num_data));
        System.out.println("The mean number is : " + mean(num_data));
    }
}
