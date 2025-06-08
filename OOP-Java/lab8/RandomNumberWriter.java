import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я файлу: ");
        String filename = scanner.nextLine();

        System.out.print("Введіть мінімальне значення: ");
        int min = scanner.nextInt();

        System.out.print("Введіть максимальне значення: ");
        int max = scanner.nextInt();

        System.out.print("Введіть кількість чисел: ");
        int count = scanner.nextInt();

        File file = new File(filename);

        try {
            if (!file.exists()) {
                System.out.println("Файл не існує. Створюємо новий файл: " + filename);
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            Random rand = new Random();

            for (int i = 0; i < count; i++) {
                int number = rand.nextInt(max - min + 1) + min;
                writer.write(number + " ");
            }

            writer.close();
            System.out.println("Числа успішно записані у файл: " + filename);
        } catch (IOException e) {
            System.out.println("Сталася помилка при записі у файл: " + e.getMessage());
        }
    }
}