package array;

public class reverseArray {
    public static int[] ReverseArray(int[] data) {
        int[] result = new int[data.length];
        for(int i = data.length; i > 0; i--) {
            result[data.length - i] = data[i - 1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] myData = {1, 2, 3, 4, 5};
        myData = ReverseArray(myData);
        System.out.println(myData);
    }
}
