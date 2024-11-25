package characters;
import java.lang.Character;
public class charHandle {
    public static void main(String[] args) {
        char myChar = 'a';

        boolean isDigit = Character.isDigit(myChar);
        System.out.println(isDigit);

        boolean isLetter = Character.isLetter(myChar);
        System.out.println(isLetter);

        boolean isLetterOrDigit = Character.isLetterOrDigit(myChar);
        System.out.println(isLetterOrDigit);

        boolean isUpperCase = Character.isUpperCase(myChar);
        System.out.println(isUpperCase);

        boolean isLowerCase = Character.isLowerCase(myChar);
        System.out.println(isLowerCase);

        // boolean isSpaceChar = Character.isSpaceChar(myChar);
        System.out.println(Character.isSpaceChar(myChar));

    }
}
