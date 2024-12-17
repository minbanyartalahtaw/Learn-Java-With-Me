package array;

public class copyArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5};
        int[] myNewList = new int[myList.length];

        // Copy array
        for(int i = 0; i < myList.length; i++) {
            myNewList[i] = myList[i];
        };

        for (int j : myNewList) {
            System.out.println(j);
        }

    }
}
