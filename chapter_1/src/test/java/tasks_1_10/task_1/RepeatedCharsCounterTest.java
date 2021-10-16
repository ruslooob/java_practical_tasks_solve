package tasks_1_10.task_1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RepeatedCharsCounterTest {

    @Test
    void calculateTest_1() {
        String str = "aabbccdd";
        Map<Character, Integer> expected = Map.of(
                'a', 2,
                'b', 2,
                'c', 2,
                'd', 2);


        Map<Character, Integer> result = RepeatedCharsCounter.calculate(str);
        assertEquals(expected, result);
    }

    @Test
    void calculateTest_2() {
        String str = "aabbccd";
        Map<Character, Integer> expected = Map.of(
                'a', 2,
                'b', 2,
                'c', 2,
                'd', 1);


        Map<Character, Integer> result = RepeatedCharsCounter.calculate(str);
        assertEquals(expected, result);
    }

    @Test
    void calculateTest_3() {
        String str = "aabb cc";
        Map<Character, Integer> expected = Map.of(
                'a', 2,
                'b', 2,
                'c', 2,
                ' ', 1);


        Map<Character, Integer> result = RepeatedCharsCounter.calculate(str);
        assertEquals(expected, result);
    }

    @Test
    void calculateTest_4() {
        String str = "aaaaaaaaaa";
        Map<Character, Integer> expected = Map.of(
                'a', 10,
                'b', 2,
                'c', 2,
                ' ', 1);


        Map<Character, Integer> result = RepeatedCharsCounter.calculate(str);
        assertNotEquals(expected, result);
    }

}