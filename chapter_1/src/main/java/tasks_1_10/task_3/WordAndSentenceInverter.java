package  tasks_1_10.task_3;

import java.util.List;

/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова и сами слова.
 * */
public class WordAndSentenceInverter {

    // Оценка: 7/10
    public static String invert(String sentence) {
        String invertedSentence = SentenceInverter.invert(sentence);
        List<String> invertedSentenceWords = List.of(invertedSentence.split(" "));
        /* Инвертированы слова в предложении и буквы в словах */
        StringBuilder doubleInvertedSentence = new StringBuilder();

        for (String word : invertedSentenceWords) {
            doubleInvertedSentence.append(WordInverter.invert(word));
            doubleInvertedSentence.append(" ");
        }

        doubleInvertedSentence.deleteCharAt(doubleInvertedSentence.length() - 1);

        return doubleInvertedSentence.toString();
    }

}
