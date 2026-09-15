public class Task7 {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Число должно быть от 0 до 20");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("0! = " + factorial(0));
        System.out.println("1! = " + factorial(1));
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));
    }
}
