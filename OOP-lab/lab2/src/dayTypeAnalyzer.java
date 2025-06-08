import java.util.Scanner;

public class dayTypeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер дня тижня (1-Пн, 7-Нд): ");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 7) {
            if (day == 6 || day == 7) {
                System.out.println("Вихідний день");
            } else {
                System.out.println("Робочий день");
            }
        } else {
            System.out.println("Невірний номер дня тижня.");
        }
    }
}
