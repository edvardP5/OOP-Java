public class Main {

    public static void main(String[] args) {
        // Приклад 1: Площа прямокутника
        int area = calculateRectangleArea(5, 10);
        System.out.println("Площа прямокутника: " + area);

        // Приклад 2: Найменше з трьох чисел
        findMinimumOfThree(7, 3, 9);

        // Приклад 3: Виведення масиву
        int[] numbers = {3, 7, 2, 9, 5};
        System.out.print("Масив: ");
        printIntArray(numbers);

        // Приклад 4: Найбільше число в масиві
        int max = findMaximumInArray(numbers);
        System.out.println("Найбільше число в масиві: " + max);
    }


    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }

    /**
     * Знаходить та повертає найменше з трьох чисел.
     *
     * @param a перше число
     * @param b друге число
     * @param c третє число
     * @return найменше з трьох чисел
     */
    public static int findMinimumOfThree(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Найменше число: " + min);
        return min;
    }

    /**
     * Виводить елементи масиву в консоль.
     *
     * @param array масив для виводу
     */
    protected static void printIntArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Повертає найбільше число з масиву.
     *
     * @param array масив чисел
     * @return найбільше число
     */
    public static int findMaximumInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
