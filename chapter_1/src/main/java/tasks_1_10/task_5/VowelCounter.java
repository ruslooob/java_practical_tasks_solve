package tasks_1_10.task_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчет гласных и согласных.
 * Написать программу, которая подсчитывает число гласных и согласных букв в заданной строке.
 * Сделать это для английского языка, который имеет пять разных гласных (a, e, i, o, u).
 * */
public class VowelCounter {

    // Оценка: 7/10
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                Integer currentLetterCount = counts.get(ch);
                counts.put(ch, currentLetterCount == null ? 1 : currentLetterCount + 1);
            }
        }

        return counts;
    }

}
