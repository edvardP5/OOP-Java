import java.util.Scanner;

public class functionalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();
        double result;

        if (x < -2) {
            result = Math.exp(2 * x);
        } else if (x >= -2 && x <= 5) {
            result = 1 / Math.tan(x); // ctg(x) = 1 / tan(x)
        } else {
            result = Math.pow(x, 4);
        }

        System.out.println("f(x) = " + result);
    }
}
