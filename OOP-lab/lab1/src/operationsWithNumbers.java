public class operationsWithNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3, d = 7, e = 2, f = 6, g = 1, h = 4, i = 8, j = 9;

        int sum = a + b + c + d + e + f + g + h + i + j;
        int subtract = a - b - c - d - e - f - g - h - i - j;
        int multiply = a * b * c * d * e * f * g * h * i * j;
        double divide = (double) a / b / c / d / e / f / g / h / i / j;

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + subtract);
        System.out.println("Множення: " + multiply);
        System.out.println("Ділення: " + divide);
    }
}