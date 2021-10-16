package tasks_1_10.task_9;

import java.util.List;

/**
 * Соединение нескольких строк с помощью разделителя.
 * Написать программу, которая соединяет заданные строки с помощью заданного разделителя.
 * */
public class StringJoiner {

    // Оценка 7/10
    public static String joinV1(String delimiter, List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strings) {
            stringBuilder.append(string);
            stringBuilder.append(delimiter);
        }

        int sbLength = stringBuilder.length();
        if (sbLength > 0) {
            stringBuilder.delete(sbLength - delimiter.length(), sbLength);
        }

        return stringBuilder.toString();
    }


}
