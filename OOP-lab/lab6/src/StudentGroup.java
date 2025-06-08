import java.util.Scanner;

public class StudentGroup {
    String name;
    int totalStudents;
    int males;
    int females;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Назва групи: ");
        name = scanner.nextLine();
        System.out.print("Кількість студентів: ");
        totalStudents = scanner.nextInt();
        System.out.print("Кількість чоловіків: ");
        males = scanner.nextInt();
        System.out.print("Кількість жінок: ");
        females = scanner.nextInt();
    }

    public void outputData() {
        System.out.println("Група: " + name);
        System.out.println("Студентів: " + totalStudents + ", Чоловіків: " + males + ", Жінок: " + females);
    }

    public void calculatePercent() {
        double malePercent = (double) males / totalStudents * 100;
        double femalePercent = (double) females / totalStudents * 100;
        System.out.printf("Чоловіки: %.2f%%, Жінки: %.2f%%\n", malePercent, femalePercent);
    }

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        group.inputData();
        group.outputData();
        group.calculatePercent();
    }
}