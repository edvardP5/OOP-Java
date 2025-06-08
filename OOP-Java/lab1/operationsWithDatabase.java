public class operationsWithDatabase {
    public static void main(String[] args) {
        User[] users = {
                new User(1, 25, "Ivan", "Petrov", 70.5, 180.0),
                new User(2, 30, "Olga", "Shevchenko", 60.2, 165.0),
                new User(3, 22, "Dmytro", "Ivanov", 75.0, 175.5),
                new User(4, 28, "Anna", "Bondar", 55.5, 160.0),
                new User(5, 35, "Oleh", "Koval", 90.0, 190.0),
                new User(6, 40, "Maria", "Kravets", 65.0, 170.0),
                new User(7, 27, "Andrii", "Tkachenko", 82.3, 182.0),
                new User(8, 31, "Iryna", "Melnyk", 58.4, 168.0),
                new User(9, 26, "Taras", "Hnatyuk", 77.7, 176.5),
                new User(10, 29, "Nadia", "Zadorozhna", 62.0, 162.0)
        };

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.println("Сумарний вік: " + totalAge);
        System.out.println("Сумарна вага: " + totalWeight);
        System.out.println("Сумарний зріст: " + totalHeight);
    }
}
