import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Task3
 * Проверка на правильность написания скобок
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "{sdvf[[]]}";
        System.out.println(sortSkobok(str));
    }

    public static boolean sortSkobok(String str1) {
        Stack<Character> data1 = new Stack<>();

        Map<Character, Character> map1 = new HashMap<>();
        map1.put(']', '[');
        map1.put('}', '{');
        map1.put(')', '(');
        map1.put('>', '<');

        char[] chr = str1.toCharArray();
        System.out.println(Arrays.toString(chr));

        for (int i = 0; i < chr.length; i++) {
            if (map1.containsValue(chr[i])) {
                data1.push(chr[i]);
            } else if (map1.containsKey(chr[i])) {
                if (data1.empty() || map1.get(chr[i]) != data1.pop()) {
                    return false;
                }
            }
        }
        return data1.empty();
    }

}
