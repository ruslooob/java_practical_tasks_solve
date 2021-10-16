package tasks_1_10.task_8;

/**
 * Удаление пробелов из строки.
 * Написать программу, которая удаляет все пробелы из заданной строки.
 * */
public class SpaceRemover {

    // Оценка: 7/10
    public static String removeV1(String sourceString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sourceString.length(); i++) {
            char currentChar = sourceString.charAt(i);
            if (currentChar != ' ') {
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }

    // Оценка 10/10
    public static String removeV2(String str) {
        return str.replace(" ", "");
    }

}
