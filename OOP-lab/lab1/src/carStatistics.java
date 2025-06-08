public class carStatistics {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(150, 2.0, "Toyota", "Camry", 2020, "White", false, 1500),
                new Car(200, 3.0, "BMW", "X5", 2021, "Black", false, 2000),
                new Car(300, 4.0, "Audi", "Q7", 2022, "Blue", false, 2200),
                new Car(250, 3.5, "Ford", "Explorer", 2019, "Red", false, 2100),
                new Car(170, 2.2, "Honda", "Accord", 2023, "Silver", false, 1600),
                new Car(450, 0.0, "Tesla", "Model S", 2023, "White", true, 1900),
                new Car(120, 1.6, "Hyundai", "Elantra", 2020, "Gray", false, 1400),
                new Car(180, 2.5, "Kia", "Sportage", 2021, "Green", false, 1650),
                new Car(160, 2.0, "Mazda", "CX-5", 2022, "Red", false, 1550),
                new Car(220, 3.2, "Mercedes", "GLC", 2022, "Black", false, 2100)
        };

        double totalVolume = 0;
        int totalHorsepower = 0;

        for (Car car : cars) {
            totalVolume += car.engineVolume;
            totalHorsepower += car.horsepower;
        }

        System.out.println("Сумарний обʼєм двигунів: " + totalVolume);
        System.out.println("Сумарна потужність: " + totalHorsepower);
    }
}
