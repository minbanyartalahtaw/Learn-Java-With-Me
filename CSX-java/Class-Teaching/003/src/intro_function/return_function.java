package intro_function;

public class return_function {
    public static int add(int a, int b) {
        return a + b;
    }
    public static String myGrade(char grade) {
        if (grade == 'A') {
            return "Excellent";
        } else {
            return "Not Excellent";
        }
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(myGrade('A'));

    }
}
