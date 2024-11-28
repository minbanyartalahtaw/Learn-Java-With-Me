package intro_array;

public class array001 {
    public static void main(String[] args) {
        // create an array
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        // for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // enhanced for
        for (int i:myArray) {
            System.out.println(i);
        }
    }
}
