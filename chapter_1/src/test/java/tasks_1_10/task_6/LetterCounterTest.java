package tasks_1_10.task_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void countTest_1() {
        assertEquals(1, LetterCounter.count(';', "advcas;askdfj"));
    }

    @Test
    void countTest_2() {
        assertEquals(2, LetterCounter.count(';', "advcas;;askdfj"));
    }

    @Test
    void countTest_3(){
        assertEquals(0, LetterCounter.count(' ', ""));
    }

    @Test
    void countTest_4() {
        assertEquals(4, LetterCounter.count('a', "advcas;askdfja"));
    }


}