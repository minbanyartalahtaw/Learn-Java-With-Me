package week002;

public class ArithmeticOverflowSample {
    public static void main(String[] args) {
        short shortValue = 32767;
        shortValue++;
        System.out.println(shortValue);
    }
}
