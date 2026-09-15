public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 3};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}
