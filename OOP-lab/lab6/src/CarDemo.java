abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void gas() {
        System.out.println("Газуємо!");
    }

    abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    void brake() {
        System.out.println("Седан гальмує плавно");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    void brake() {
        System.out.println("Грузовик гальмує повільно");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car sedan = new Sedan("Toyota Camry", "Червоний", 220);
        Car truck = new Truck("Volvo", "Білий", 180);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
}