package tasks_11_20.task_14;

import java.util.HashMap;
import java.util.Map;

/**
 * Отыскание символа с наибольшим числом появлений.
 * Написать программу, которая отыскивает символ с наибольшим числом появлений в заданной строке.
 * */

// Оценка: 6/10 (Много букв, но код не сложный)
public class MostFrequentCharCalculator {

    public static Character calculate(String str) {
        int length = str.length();
        if (length == 0) {
            return null;
        }

        Map<Character, Integer> counts = new HashMap<>();

        /* Подсчет числа всех символов */
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            Integer currentCharCount = counts.get(currentChar);
            counts.put(currentChar, currentCharCount == null ? 1 : currentCharCount + 1);
        }

        /* поиск самого частого символа */
        char maxCountChar = str.charAt(0);
        int maxCount = 1;
        for (char key : counts.keySet()) {
            int currentChar = counts.get(key);
            if (currentChar > maxCount) {
                maxCount = currentChar;
                maxCountChar = key;
            }
        }

        return maxCountChar;
    }

}
