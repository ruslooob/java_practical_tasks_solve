package tasks_11_20.task_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerTest {

    @Test
    void checkTest_1() {
        assertTrue(PalindromeChecker.checkV1("abcddcba"));
    }

    @Test
    void checkTest_2() {
        assertTrue(PalindromeChecker.checkV1("aba"));
    }

    @Test
    void checkTest_3() {
        assertFalse(PalindromeChecker.checkV1("abcdefgh14g1hgfedcba"));
    }

    @Test
    void checkTest_4() {
        assertTrue(PalindromeChecker.checkV1("qwertyuiop[]][poiuytrewq"));
    }

    @Test
    void checkTest_5() {
        assertFalse(PalindromeChecker.checkV1("Паллип"));
    }

}