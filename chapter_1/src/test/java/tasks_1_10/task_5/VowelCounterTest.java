package tasks_1_10.task_5;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {

    @Test
    void countTest_1() {
        Map<Character, Integer> result = VowelCounter.count("as;dklfjioeoa");
        assertAll(
                () -> assertEquals(2, result.get('a')),
                () -> assertEquals(1, result.get('s')),
                () -> assertNull(result.get(';')),
                () -> assertEquals(1, result.get('d')),
                () -> assertEquals(1, result.get('k')),
                () -> assertEquals(1, result.get('l')),
                () -> assertEquals(1, result.get('j')),
                () -> assertEquals(1, result.get('i')),
                () -> assertEquals(2, result.get('o'))
        );
    }

}