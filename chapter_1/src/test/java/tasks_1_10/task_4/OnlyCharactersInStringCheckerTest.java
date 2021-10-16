package tasks_1_10.task_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlyCharactersInStringCheckerTest {

    @Test
    void checkTest_1() {
        assertTrue(OnlyCharactersInStringChecker.check("kasdfj;ajsd;f"));
    }

    @Test
    void checkTest_2() {
        assertFalse(OnlyCharactersInStringChecker.check("kasdfj;ajs1d;f"));
    }

    @Test
    void checkTest_3() {
        assertTrue(OnlyCharactersInStringChecker.check(""));
    }

    @Test
    void checkTest_4() {
        assertFalse(OnlyCharactersInStringChecker.check("kasdfj;ajsd;f1"));
    }

    @Test
    void checkTest_5() {
        assertFalse(OnlyCharactersInStringChecker.check("1"));
    }

}