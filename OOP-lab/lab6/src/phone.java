public class phone {
    String number;
    String model;
    double weight;

    public phone() {}

    public phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " з номером " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Повідомлення надіслано на номери:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        phone p1 = new phone("12345", "Nokia", 120);
        phone p2 = new phone("67890", "Samsung");
        phone p3 = new phone();

        System.out.println(p1.number + " " + p1.model + " " + p1.weight);
        System.out.println(p2.number + " " + p2.model);

        p1.receiveCall("Олег");
        System.out.println("Номер: " + p1.getNumber());

        p2.receiveCall("Марія", "67890");

        p3.sendMessage("11111", "22222", "33333");
    }
}
