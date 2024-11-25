package characters;

public class intro_string {
    public static void main(String[] args) {
        String myString = "Hello World";
        System.out.println(myString);

        char newString[] = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
        System.out.println(newString);
        System.out.println(newString[0]);

        // class string
        String myNewString = new String("Hello World");
        System.out.println(myNewString.length());
    }
}
