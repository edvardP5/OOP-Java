import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99 || number <= -10 && number >= -99) {
            if (number % 2 == 0)
                System.out.println("Число двозначне і парне.");
            else
                System.out.println("Число двозначне, але не парне.");
        } else {
            System.out.println("Число не є двозначним.");
        }
    }
}
