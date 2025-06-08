public class ArraySumCalculator {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.0, -3.5, 4.2, 5.3};
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
