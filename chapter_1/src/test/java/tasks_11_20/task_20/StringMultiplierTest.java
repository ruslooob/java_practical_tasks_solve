package tasks_11_20.task_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMultiplierTest {

    @Test
    void default_MultiplyTest() {
        assertEquals("abcabcabc", StringMultiplier.multiplyV1("abc", 3));
        assertEquals("abcabcabc", StringMultiplier.multiplyV2("abc", 3));
    }

    @Test
    void emptyString_MultiplyTest() {
        assertEquals("", StringMultiplier.multiplyV1("", 100));
        assertEquals("", StringMultiplier.multiplyV2("", 100));
    }

}