public class Euler1 {
    public static int multiples(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            if (i % 3 == 0 || i% 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(multiples(1000));
    }
}