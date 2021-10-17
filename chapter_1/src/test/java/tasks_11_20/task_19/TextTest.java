package tasks_11_20.task_19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void default_TextTest() {
        assertNotNull(Text.PAPICH_WORDS);
        assertNotNull(Text.HELLO_WORLD);
    }

}