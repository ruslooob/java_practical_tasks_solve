package task_3;

public class WordInverter {

    public static String invert(String str) {
        StringBuilder word = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            word.append(str.charAt(i));
        }

        return word.toString();
    }

}
