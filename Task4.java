// Задание
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
//  телефонами, их необходимо считать, как одного человека с разными телефонами.
// (Дополнительно) Вывод должен быть отсортирован по убыванию числа телефонов.
// Меню:
// 1) Добавить контакт
// 2) Вывести всех
// 3) Выход

// Иванов 124312345
// Иванов 2354234
// Иванов: [124312345, 2354234], "124312345, 2354234"
// Иванов 23542345
// Иванов: [124312345, 2354234, 23542345], "124312345, 2354234, 23542345"

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String[]> contact = new HashMap<>();
        Integer count = 1;
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;

        while (flag) {
            System.out.println("\n1)Добавить новый контакт");
            System.out.println("2)Показать контакты");
            System.out.println("3)Выход");
            System.out.print("Выберите действие: ");
            String value = scanner.nextLine();

            switch (value) {
                case "1":
                    count = addContact(contact, count);
                    break;
                case "2":
                    showContact(contact);
                    break;
                case "3":
                    flag = false;
                default:
                    break;
            }
        }
        scanner.close();
    }

    public static Integer addContact(Map<Integer, String[]> contact, Integer count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя контакта: ");
        String valueName = scanner.nextLine();
        System.out.println("Введите номера телефонов через пробел: ");
        String valueNumbers = scanner.nextLine();
        String[] data = { valueName, valueNumbers };
        contact.put(count, data);
        return ++count;
        // scanner.close();

    }

    public static void showContact(Map<Integer, String[]> contact) {
        if (contact.isEmpty())
            System.out.println("Справочник пуст!");
        else {
            System.out.println("----------------------------------");
            System.out.println("Список контактов");
            System.out.println("----------------------------------");
            for (var item : contact.entrySet()) {
                System.out.println(item.getKey() + " " + Arrays.toString(item.getValue())
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", ":"));
            }
        }

    }
}
