package task_1;

import java.util.HashMap;
import java.util.Map;


/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
 * */
public class RepeatedCharsCounter {

    public static Map<Character, Integer> calculate(String str) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            counts.put(str.charAt(i), counts.get(str.charAt(i)) == null ? 1 : counts.get(str.charAt(i)) + 1);
        }

        return counts;
    }

}
