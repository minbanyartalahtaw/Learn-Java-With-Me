package intro_array;

public class array003 {
    public static String incomeRange(long income) {
        String result = "";
        if (income > 1000000) {
            result="High Income";
        } else {
            result="Low Income";
        }
        return result;
    }

    public static void show_name(String[] names,int[] ages,long[] income) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("My name is " + names[i] + " and I am " + ages[i] + " years old. And my montly income is " + incomeRange(income[i]));
        }
    }
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Bob", "Alice"};
        int[] ages = {25, 30, 35, 40};
        long[] income = {10000000, 200000, 300000, 40000};
        show_name(names,ages,income);
    }
}
