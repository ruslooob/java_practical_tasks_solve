package tasks_1_10.task_4;

/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 * */
public class OnlyCharactersInStringChecker {

    // Оценка: 5/10 (Нетипичное использование исключений и множество передач управлений)
    public static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            try {
                Integer.parseInt(str.substring(i, i + 1));
            } catch (NumberFormatException ignored) {
                continue;
            }
            return false;
        }
        return true;
    }

}


