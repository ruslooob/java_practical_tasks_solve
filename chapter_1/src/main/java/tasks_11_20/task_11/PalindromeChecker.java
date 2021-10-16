package tasks_11_20.task_11;

/**
 * Проверка, что строка является палиндромом.
 * Написать программу, которая выясняет, является ли данная строка палиндромом или нет.
 * */

// Оценка: 7/10
public class PalindromeChecker {

    public static boolean checkV1(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

}
