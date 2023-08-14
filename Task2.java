import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        // Даны 2 строки, написать метод, который вернет true, если эти строки являются
        // изоморфными и false, если нет.
        // Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
        // букву во втором слове, при этом
        //
        // 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
        // сохранением порядка следования. (Например, add - egg изоморфны)
        // 2. буква может не меняться, а остаться такой же. (Например, note - code)
        //
        // Пример 1:
        //
        // Input: s = "foo", t = "bar"
        //
        // Output: false
        //
        // Пример 2:
        //
        // Input: s = "paper", t = "title"
        //
        // p - t
        // a - i
        // e - l
        // r - e
        //
        // Output: true
        String name1 = "paper";
        String name2 = "title";
        System.out.println(izomophe(name1, name2) && izomophe(name2, name1));

    }

    public static Boolean izomophe(String name1, String name2) {
        if (name1.length() != name2.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        char[] chr = name1.toCharArray();
        char[] chr2 = name2.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (!map1.containsKey(chr[i])) {
                map1.put(chr[i], chr2[i]);

            } else if (map1.get(chr[i]) != chr2[i]) {
                return false;
            }

        }
        return true;
    }
}