package control_structure;

public class forlorn {
    public static void main(String[] args) {
        // normal for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i  + " ");
        }

        // Jump 2 step a head
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i  + " ");
        }

        //Decrease
        for (int i = 10; i >= 1; i--) {
            System.out.print(i  + " ");
        }
    }
}
