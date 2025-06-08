public class numberFilter {
    public static void main(String[] args) {
        int[] evenArray = new int[50]; // масив для парних чисел
        int[] oddArray = new int[50];  // масив для непарних чисел

        int even = 2;
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = even;
            even += 2;
        }

        int odd = 1;
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = odd;
            odd += 2;
        }



        System.out.println("Even numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
    }
}
