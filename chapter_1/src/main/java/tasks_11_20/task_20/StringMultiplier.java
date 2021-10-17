package tasks_11_20.task_20;

/**
 * Конкатенирование одной и той же строки n раз.
 * Написать программу, которая конкатенирует одну и ту же строку заданное число раз.
 * */
public class StringMultiplier {

    // Оценка 7/10
    public static String multiplyV1(String str, int times) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < times; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    // Оценка: 10/10
    public static String multiplyV2(String str, int times) {
        return str.repeat(times);
    }

}
