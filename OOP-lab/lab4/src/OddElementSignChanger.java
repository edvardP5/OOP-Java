public class OddElementSignChanger {
    public static void main(String[] args) {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Початковий масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Зміна знаку тільки непарних елементів
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -arr[i];
            }
        }

        System.out.println("\nМасив після зміни знаку непарних елементів:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
