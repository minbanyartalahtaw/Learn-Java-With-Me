package intro_array;

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

    public static int[] even(int[] num_data) {
        int[] evenNumber = new int[num_data.length];
        for (int i = 0; i < num_data.length;i++) {
            if (num_data[i] % 2 == 0 ) {
                evenNumber[i] = num_data[i];
            };
        };
        return evenNumber;
    };
    public static void main(String[] args) {
        int[] num_data = {100,469,782,605,243,712,402};
        System.out.println("The max number is : " + max(num_data));
        System.out.println("The min number is : " + min(num_data));
        System.out.println("The sum number is : " + sum(num_data));
        System.out.println("The even number is : " + even(num_data));
    }
}
