package tasks_1_10.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordAndSentenceInverterTest {

    @Test
    void invertTest_1() {
        String sentence = "Hello world!";
        String expected = "!dlrow olleH";
        String result = WordAndSentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_2() {
        String sentence = "I'll be back";
        String expected = "kcab eb ll'I";
        String result = WordAndSentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_3() {
        String sentence = "ksdfj;aa;skdfj;";
        String expected = ";jfdks;aa;jfdsk";
        String result = WordAndSentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_4() {
        String sentence = "";
        String expected = "";
        String result = WordAndSentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }


}