package tasks_1_10.task_2;

/**
 * Отыскивание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной сроке.
 * */
public class FirstUnrepeatedCharacterFinder {

    // Оценка: 5/10 (Слишком много передач управления в коде 4 штуки)
    public static Character find(String str) {
        int length = str.length();

        externalLoop:
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) continue ;
                if (str.charAt(i) == str.charAt(j)) {
                    continue externalLoop;
                }
            }
            return str.charAt(i);
        }
        return null;
    }
}
