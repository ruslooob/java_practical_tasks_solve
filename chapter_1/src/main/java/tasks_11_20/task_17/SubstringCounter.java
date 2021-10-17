package tasks_11_20.task_17;

/**
 * Подсчет числа появлений подстроки в строке.
 * Написать программу, которая подсчитывает число появлений заданной строки в другой строке.
 * */
public class SubstringCounter {

    //Оценка: 5/10 (много переходов и неочевидные границы цикла)
    public static int count(String substr, String str) {
        int strLength = str.length();
        int substrLength = substr.length();

        if (strLength < substrLength) {
            return 0;
        } else if (strLength == substrLength) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < strLength - substrLength + 1; i++) {
            if (str.substring(i, i + substrLength).equals(substr)) {
                count++;
            }
        }

        return count;
    }

}
