package task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordInverterTest {

    @Test
    void invertTest_1() {
        String word = "abcdefgh";
        String expected = "hgfedcba";
        String result = WordInverter.invert(word);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_2() {
        String word = "159951a";
        String expected = "a159951";
        String result = WordInverter.invert(word);
        assertEquals(expected, result);
    }

    @Test
    void invertTest_3() {
        String word = "aaa";
        String expected = "aaaa";
        String result = WordInverter.invert(word);
        assertNotEquals(expected, result);
    }

    @Test
    void invertTest_4() {
        String word = "vnjd";
        String expected = "djnv";
        String result = WordInverter.invert(word);
        assertEquals(expected, result);
    }


}