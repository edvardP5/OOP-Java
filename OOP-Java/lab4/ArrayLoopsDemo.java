public class ArrayLoopsDemo {
    public static void main(String[] args) {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        // Цикл while
        System.out.println("Цикл while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        // Цикл for
        System.out.println("\nЦикл for:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        // while + непарні індекси
        System.out.println("\n\nНепарні індекси (while):");
        i = 0;
        while (i < arr.length) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }

        // for + парні індекси
        System.out.println("\nПарні індекси (for):");
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }

        // Зворотній порядок
        System.out.println("\n\nМасив у зворотному порядку:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
