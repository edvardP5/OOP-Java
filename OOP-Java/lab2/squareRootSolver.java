import java.util.Scanner;

public class squareRootSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корені: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корінь: x = " + x);
        } else {
            System.out.println("Рівняння не має дійсних коренів.");
        }
    }
}
