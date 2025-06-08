import java.util.Scanner;

public class TabulateFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть нижню межу діапазону значень функції: ");
        double low = scanner.nextDouble();

        System.out.print("Введіть верхню межу діапазону значень функції: ");
        double high = scanner.nextDouble();

        int countFor = 0;
        System.out.println("\n--- Табуляція (for): ---");
        for (double x = 1; x <= 3; x += 0.1) {
            double fx = 1 - x + Math.sin(x) - Math.cos(1 + x);
            System.out.printf("x = %.2f; f(x) = %.4f%n", x, fx);
            if (fx >= low && fx <= high) {
                countFor++;
            }
        }

        if (countFor > 0) {
            System.out.println("Кількість значень у діапазоні: " + countFor);
        } else {
            System.out.println("Значення функції у вказаному діапазоні відсутні.");
        }

        int countWhile = 0;
        double x = 1;
        System.out.println("\n--- Табуляція (while): ---");
        while (x <= 3) {
            double fx = 1 - x + Math.sin(x) - Math.cos(1 + x);
            System.out.printf("x = %.2f; f(x) = %.4f%n", x, fx);
            if (fx >= low && fx <= high) {
                countWhile++;
            }
            x += 0.1;
        }

        if (countWhile > 0) {
            System.out.println("Кількість значень у діапазоні: " + countWhile);
        } else {
            System.out.println("Значення функції у вказаному діапазоні відсутні.");
        }
    }
}
