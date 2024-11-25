package intro_function;

public class myFunction {
    // if we want to create function start here this is normal function
    public static void showGreeting() {
        System.out.println("Hello World");
        System.out.println("My name is Min Banyar Tala Htaw");
    }

    // parameter in function
    public static void showInfo(String name, int age, String job) {
        System.out.println("My name is " + name + " and my age is " + age + " and my job is " + job);
    }

    public static void main(String[] args) {
        showGreeting();
        showInfo("Min Banyar Tala Htaw", 21, "Student");

    }
}

