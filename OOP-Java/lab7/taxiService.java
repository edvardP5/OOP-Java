import java.util.*;

class Driver {
    private final String name;
    private final int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getExperience() { return experience; }
    public void increaseExperience() { experience++; }

    @Override
    public String toString() {
        return name + ", вік: " + age + ", досвід: " + experience + " років";
    }
}

class Car {
    private final String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private final int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public double getEnginePower() { return enginePower; }
    public void setEnginePower(double enginePower) { this.enginePower = enginePower; }
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
    public void increasePrice(double percent) { this.price *= (1 + percent / 100); }

    @Override
    public String toString() {
        return brand + ", потужність: " + enginePower + ", водій: [" + driver + "], ціна: " + price + ", рік: " + year;
    }
}

class CarHelper {
    public static void callCar(ArrayList<Car> cars) {
        Random rand = new Random();
        int index = rand.nextInt(cars.size());
        Car chosen = cars.get(index);
        System.out.println("Автомобіль марки " + chosen.getBrand() + " з водієм " + chosen.getDriver().getName() + " виїхав за вами.");
        carArrived(chosen);
    }

    public static void carArrived(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце.");
    }
}

public class taxiService {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        // Створення водіїв
        Driver[] drivers = {
                new Driver("Іван", 30, 4),
                new Driver("Олег", 40, 10),
                new Driver("Марія", 28, 3),
                new Driver("Петро", 35, 6),
                new Driver("Сергій", 50, 20),
                new Driver("Наталя", 27, 2),
                new Driver("Андрій", 33, 7),
                new Driver("Юлія", 38, 9),
                new Driver("Ірина", 29, 1),
                new Driver("Богдан", 45, 15),
                new Driver("Катерина", 26, 0)
        };

        // Створення машин
        cars.add(new Car("Toyota", 150, drivers[0], 20000, 2018));
        cars.add(new Car("BMW", 180, drivers[1], 30000, 2020));
        cars.add(new Car("Audi", 160, drivers[2], 28000, 2019));
        cars.add(new Car("Mercedes", 200, drivers[3], 35000, 2021));
        cars.add(new Car("Skoda", 130, drivers[4], 18000, 2017));
        cars.add(new Car("Kia", 120, drivers[5], 16000, 2016));
        cars.add(new Car("Hyundai", 140, drivers[6], 17000, 2018));
        cars.add(new Car("Volkswagen", 150, drivers[7], 22000, 2019));
        cars.add(new Car("Ford", 125, drivers[8], 15000, 2015));
        cars.add(new Car("Chevrolet", 135, drivers[9], 19000, 2017));

        // Ремонт половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1); // +10% потужності
            car.setDriver(drivers[10]); // новий водій
        }

        // Кожна друга машина - підвищення потужності +10%, ціни +5%
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1);
            car.increasePrice(5);
        }

        // Підвищення кваліфікації водіїв
        for (Car car : cars) {
            Driver d = car.getDriver();
            if (d.getExperience() < 5 && d.getAge() > 25) {
                d.increaseExperience();
            }
        }

        // Демонстрація роботи хелпера
        CarHelper.callCar(cars);
    }
}
