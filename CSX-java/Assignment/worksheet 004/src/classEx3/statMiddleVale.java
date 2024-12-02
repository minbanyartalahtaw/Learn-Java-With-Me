/*
name - Min Banyar Tala Htaw
ID - 6715168
Section - 543
* */
package classEx3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class statMiddleVale {
    // mean method
    public static double mean(ArrayList<Integer>[] data) {
    int totalSum = 0;
    int dataLength = 0;
        for (ArrayList<Integer> datum : data) {
            for (Integer num : datum) {
                totalSum += num;
                dataLength++;
            }
        }
        return (double) totalSum / dataLength;
}
    // medium method
    public static double medium(ArrayList<Integer> data) {
        Collections.sort(data);
        int dataLength = data.size();
        if (dataLength % 2 == 0) {
            int firstMiddle = data.get(dataLength / 2 - 1);
            int secondMiddle = data.get(dataLength / 2);
            return (firstMiddle + secondMiddle) / 2.0;
        } else {
            return (double) data.get(dataLength / 2);
        }
    }
    // mode method
    public static int mode(ArrayList<Integer> data) {
        int maxCount = 0;
        int mode = 0;
        for (int i = 0; i < data.size(); i++) {
            int count = 0;
             for (int j = 0; j < data.size(); j++) {
                if (data.get(i) == data.get(j)) {
                    count++;
                };
             };
            if (count > maxCount) {
                maxCount = count;
                mode = data.get(i);
            };
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array length : ");
        int ArrayLength = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        while ( i <= ArrayLength-1) {
            int displayNumber = i + 1;
            System.out.print("Please enter a number "+ displayNumber + " : ");
            int userInput = sc.nextInt();
            if (userInput > 101) {
                System.out.println("Please Enter a number Between 0 - 100");
                continue;
            } else {
                arrayList.add(userInput);
                i ++;
            }
        }
        System.out.println("Mean : " + mean(new ArrayList[]{arrayList}));
        System.out.println("Median : " + medium(arrayList));
        System.out.println("Mode : " + mode(arrayList));

        sc.close();
    }
}
