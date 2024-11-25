package characters;

public class string_spilt {
    public static void main(String[] args) {
        String myString = "Apple";
        // Split String Important
        String[] myArray = myString.split("");

        for(String text: myArray) {
            System.out.println(" - " + text);
        }
    }
}
