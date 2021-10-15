package task_2;

/**
 * Отыскивание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной сроке.
 * */
public class FirstUnrepeatedCharacterFinder {

    public static Character find(String str) {
        externalLoop:
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
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
