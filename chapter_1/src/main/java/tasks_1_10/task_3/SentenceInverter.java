package tasks_1_10.task_3;

import java.util.List;

public class SentenceInverter {

    // Оценка: 7/10
    public static String invert(String sentence) {
        List<String> words = List.of(sentence.split(" "));
        StringBuilder invertedSentence = new StringBuilder();

        for (int i = words.size() - 1; i >= 0 ; i--) {
            invertedSentence.append(words.get(i));
            invertedSentence.append(" ");
        }
        invertedSentence.deleteCharAt(invertedSentence.length() - 1);

        return invertedSentence.toString();
    }

}
