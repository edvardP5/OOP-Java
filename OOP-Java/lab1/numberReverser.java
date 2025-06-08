public class numberReverser {
    public static void main(String[] args) {
        int number = 412;

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        int reversed = ones * 100 + tens * 10 + hundreds;

        System.out.println("Оригінал: " + number);
        System.out.println("Реверс: " + reversed);
    }
}
