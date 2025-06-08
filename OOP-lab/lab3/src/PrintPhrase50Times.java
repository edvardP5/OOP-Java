public class PrintPhrase50Times {
    public static void main(String[] args) {
        String phrase = "Java — це круто!";

        // Цикл for
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Цикл while
        int i = 0;
        while (i < 50) {
            System.out.println(phrase);
            i++;
        }
    }
}