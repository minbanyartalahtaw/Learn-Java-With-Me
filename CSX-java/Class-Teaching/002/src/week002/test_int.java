package week002;

public class test_int {
    public static void main(String[] args) {
        int a = 0x1a;
        System.out.println(a);

        int b = 0b1010;
        System.out.println(b);

        long creditNumber = 1234_5678_9012_3456L;
        System.out.println(creditNumber);

        long socialSecurityNumber = 999_99_9999L;
        System.out.println(socialSecurityNumber);

        float pi = 3.14F;
        System.out.println(pi);

        double e = 2.71;
        System.out.println(e);

        long hexBytes = 0x1a_2b_3c_4d;
        System.out.println("hello this is hexBytes : "+hexBytes);

        long binaryBytes = 0b1010_1010_1010_1010_1010_1010_1010_1010;
        System.out.println(binaryBytes);
    }
}
