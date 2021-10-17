package tasks_11_20.task_16;

/**
 * Проверка наличия подстроки в строке.
 * Написать программу, которая проверяет, содержит ли заданная строка заданную строку.
 * */
public class SubstringMatcher {

    // Оценка: 5/10 (много переходов и неочевидные +-1)
    public static Boolean match(String substr, String str) {
        int strLength = str.length();
        int substrLength = substr.length();

        if (strLength < substrLength) {
            return null;
        } else if (strLength == substrLength) {
            return str.equals(substr);
        }

        for (int i = 0; i < strLength - substrLength + 1; i++) {
            if (str.substring(i, i + substrLength).equals(substr)) {
                return true;
            }
        }

        return false;
    }

}
