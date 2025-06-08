public class AdvancedStudentGroup extends StudentGroup {
    String specialization;
    String curatorName;

    @Override
    public void outputData() {
        super.outputData();
        System.out.println("Спеціалізація: " + specialization);
        System.out.println("Куратор: " + curatorName);
    }

    public static void main(String[] args) {
        AdvancedStudentGroup advGroup = new AdvancedStudentGroup();
        advGroup.name = "АП-22";
        advGroup.totalStudents = 20;
        advGroup.males = 19;
        advGroup.females = 1;
        advGroup.specialization = "Програмно-апаратні пристрої інформаційно комунікаційних систем";
        advGroup.curatorName = "Петро Іванов";

        advGroup.outputData();
        advGroup.calculatePercent();
    }
}