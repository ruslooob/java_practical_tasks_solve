package task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceInverterTest {

    @Test
    void invertTest_1() {
        String sentence = "Hello world!";
        String expected = "world! Hello";
        String result = SentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_2() {
        String sentence = "asdkfk ksdfj asdkfj a;skdjf";
        String expected = "a;skdjf asdkfj ksdfj asdkfk";
        String result = SentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_3() {
        String sentence = "aaaa";
        String expected = "aaaa";
        String result = SentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_4() {
        String sentence = "";
        String expected =  "";
        String result = SentenceInverter.invert(sentence);
        assertEquals(expected, result);
    }
}