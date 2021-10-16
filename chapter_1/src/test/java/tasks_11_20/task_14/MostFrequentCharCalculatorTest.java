package tasks_11_20.task_14;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertNull;

class MostFrequentCharCalculatorTest {

    @Test
    void calculateTest_1() {
        assertThat(MostFrequentCharCalculator.calculate("askdfja;sdjf;asdjfk"), equalTo('a'));
    }

    @Test
    void calculateTest_2() {
        assertThat(MostFrequentCharCalculator.calculate(" ") , equalTo(' '));
    }

    @Test
    void calculateTest_3() {
       assertNull(MostFrequentCharCalculator.calculate(""));
    }

}