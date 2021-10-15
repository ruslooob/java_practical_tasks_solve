package task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FirstUnrepeatedCharacterFinderTest {

    @Test
    void findTest_1() {
        String str = "aabbccddf";
        Character expected = 'f';
        Character result = FirstUnrepeatedCharacterFinder.find(str);
        assertEquals(expected, result);
    }

    @Test
    void findTest_2() {
        String str = "aabbccasdkfj;asdjfk";
        Character expected = ';';
        Character result = FirstUnrepeatedCharacterFinder.find(str);
        assertEquals(expected, result);
    }

    @Test
    void findTest_3() {
        String str = "sdjfiqwejrf;aksdj";
        Character expected = 'i';
        Character result = FirstUnrepeatedCharacterFinder.find(str);
        assertEquals(expected, result);
    }

    @Test
    void findTest_4() {
        String str = "aaaaaaaaaaaaaaaaaaa";
        Character result = FirstUnrepeatedCharacterFinder.find(str);
        assertNull(result);
    }

}