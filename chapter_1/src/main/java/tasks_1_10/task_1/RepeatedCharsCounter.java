package tasks_1_10.task_1;

import java.util.HashMap;
import java.util.Map;


/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 * */
public class RepeatedCharsCounter {

    // Оценка: 7/10
    public static Map<Character, Integer> calculate(String str) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            Integer currentCharCount = counts.get(currentChar);
            counts.put(currentChar, currentCharCount == null ? 1 : currentCharCount + 1);
        }

        return counts;
    }

}
