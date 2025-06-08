import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RandomNumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я файлу для читання: ");
        String filename = scanner.nextLine();

        try (FileReader reader = new FileReader(filename)) {
            int character;
            System.out.println("Вміст файлу \"" + filename + "\":");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Сталася помилка при зчитуванні файлу: " + e.getMessage());
        }
    }
}