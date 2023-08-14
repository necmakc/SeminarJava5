import java.util.HashMap;
import java.util.Map;

/**
 * Task1
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
 * организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */

public class Task1 {

    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(123456, "Иванов");
        mp.put(321456, "Васильев");
        mp.put(234561, "Петрова");
        mp.put(234432, "Иванов");
        mp.put(654321, "Петрова");
        mp.put(345678, "Иванов");
        String name = "Иванов";
        for (var item : mp.entrySet()) {
            if (item.getValue().equals(name))
                System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}