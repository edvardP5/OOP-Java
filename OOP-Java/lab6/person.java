public class person {
    String fullName;
    int age;

    public person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    public person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person("Іван Петренко", 25);

        p1.talk();
        p2.move();
    }
}
