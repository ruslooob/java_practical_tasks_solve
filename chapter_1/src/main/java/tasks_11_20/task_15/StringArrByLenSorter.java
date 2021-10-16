package tasks_11_20.task_15;

import java.util.Comparator;
import java.util.List;

/**
 * Сортировка массива строк по длине.
 * Написать программу, которая сортирует заданный массив по длине строк.
 * */
public class StringArrByLenSorter {

    // Оценка: 9/10
    public static List<String> sort(List<String> strings) {
        strings.sort(Comparator.comparingInt(String::length));
        return strings;
    }

}
