package tasks_1_10.task_7;


/**
 * Конвертирование строки в значение типа int, float или double.
 * Напишите программу, которая конвертирует заданный объект типа String (представляющего число)
 * в значение типа int, long, float или double.
 * */
public class StringConverter {

    public static Integer toInteger(String str) {
        return Integer.parseInt(str);
    }

    public static Long toLong(String str) {
        return Long.parseLong(str);
    }

    public static Float toFloat(String str) {
        return Float.parseFloat(str);
    }

    public static Double toDouble(String str) {
        return Double.parseDouble(str);
    }

}
