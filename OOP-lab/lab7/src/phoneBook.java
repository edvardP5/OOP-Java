import java.util.*;

public class phoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = getStringStringHashMap();


        // Вивід всіх записів
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Пошук номера за прізвищем
        String searchName = "Кравчук";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Номер " + searchName + ": " + phoneBook.get(searchName));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису
        phoneBook.remove("Мельник");

        // Перевірки
        System.out.println("Чи є Шевченко? " + phoneBook.containsKey("Шевченко"));
        System.out.println("Чи є номер 0972222222? " + phoneBook.containsValue("0972222222"));
        System.out.println("Кількість записів: " + phoneBook.size());

        //реалізація пошуку ключа hashmap по його значенню
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер телефону для пошуку: ");
        String inputNumber = scanner.nextLine();

        boolean found = false;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(inputNumber)) {
                System.out.println("Номер " + inputNumber + " належить: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Номер " + inputNumber + " не знайдено у книзі.");
        }

        scanner.close();
    }

    private static HashMap<String, String> getStringStringHashMap() {
        HashMap<String, String> phoneBook = new HashMap<>();

        // Додавання записів
        phoneBook.put("Іванов", "0961111111");
        phoneBook.put("Петренко", "0961111111");
        phoneBook.put("Сидорчук", "0933333333");
        phoneBook.put("Коваленко", "0994444444");
        phoneBook.put("Мельник", "0955555555");
        phoneBook.put("Шевченко", "0986666666");
        phoneBook.put("Ткачук", "0947777777");
        phoneBook.put("Бондар", "0928888888");
        phoneBook.put("Захаренко", "0919999999");
        phoneBook.put("Кравчук", "0900000000");
        return phoneBook;
    }
}
