public class areaOfTriangle {
    public static double areaOfTriangle(int a, int b, int c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String[] args) {
        System.out.println(areaOfTriangle(3, 4, 5));
    }
}
