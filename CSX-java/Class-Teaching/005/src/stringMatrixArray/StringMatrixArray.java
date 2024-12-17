package stringMatrixArray;

public class StringMatrixArray {
    public static String toStar(int num) {
        String result = "";
        for(int i = 1; i <= num;i++) {
            result = result + "*";
        }
        return result;
    }
    public static void main (String[] args) {
        String[][] myString = {{ "Hello", "World", "John" }, { "Java", "Programming" , "Language" }};
        for(int i = 0; i < myString.length; i++ ){
            for(int j = 0; j< myString[i].length; j++){
                System.out.println(toStar(myString[i][j].length()));
            }
        }
    }
}
