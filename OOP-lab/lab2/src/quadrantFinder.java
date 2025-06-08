import java.util.Scanner;

public class quadrantFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть x: ");
        int x = scanner.nextInt();
        System.out.print("Введіть y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
            System.out.println("I квадрант");
        else if (x < 0 && y > 0)
            System.out.println("II квадрант");
        else if (x < 0 && y < 0)
            System.out.println("III квадрант");
        else if (x > 0 && y < 0)
            System.out.println("IV квадрант");
        else
            System.out.println("Точка знаходиться на осі");
    }
}
