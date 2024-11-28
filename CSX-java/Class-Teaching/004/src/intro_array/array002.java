package intro_array;

public class array002 {
    public static void main(String[] args) {
        int[] myData = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < myData.length; i++) {
            System.out.println(myData[i]);
        }
        for (int num : myData) {
            System.out.println(num);
        }
    }
}
