package tasks_1_10.task_6;

/**
 * Подсчет появлений некоторого символа.
 * Написать программу, которая подсчитывает появления того или иного символа в заданной строке.
 * */
public class LetterCounter {

    // Оценка 7/10
    public static Integer count(Character ch, String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch.equals(str.charAt(i))) {
                 count++;
            }
        }

        return count;
    }

}
