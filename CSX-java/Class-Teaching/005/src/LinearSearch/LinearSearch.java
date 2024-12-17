package LinearSearch;

public class LinearSearch {
    public static boolean LinearSearch(int[] data,int target) {
        for (int datum : data) {
            if (datum == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myData = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(LinearSearch(myData, target));
    }
}
