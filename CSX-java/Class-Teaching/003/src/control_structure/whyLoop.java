package control_structure;

public class whyLoop {
    public static void main(String[] args) {
        // while loop
        // check the condition then execute code
        int myNum = 0;
        while (myNum < 10) {
            System.out.print(myNum);
            myNum++;
        }
        System.out.println(" ");

        // do while loop
        // execute code first then check the condition
        int i = 0;
        do {
            System.out.print(i);
            i++;
        }
        while (i < 10);
    }
}
