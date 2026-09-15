import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Введите размер массива больше 0: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] numbers = new int[size];
        int i = 0;

        while (i < numbers.length) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        }

        int sumWhile = 0;
        int min = numbers[0];
        int max = numbers[0];
        i = 0;

        while (i < numbers.length) {
            sumWhile += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

            i++;
        }

        int sumDoWhile = 0;
        i = 0;

        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("Сумма через while: " + sumWhile);
        System.out.println("Сумма через do while: " + sumDoWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);

        scanner.close();
    }
}
