package tasks_1_10.task_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceRemoverTest {

    @Test
    void removeV1_1() {
        assertEquals("sdafjsdf", SpaceRemover.removeV1("s d a f j s d f "));
        assertEquals("sdafjsdf", SpaceRemover.removeV2("s d a f j s d f "));
    }

    @Test
    void removeV1_2() {
        assertEquals("", SpaceRemover.removeV1("     "));
        assertEquals("", SpaceRemover.removeV2("     "));
    }

    @Test
    void removeV1_3() {
        assertEquals("ksdf", SpaceRemover.removeV1("  ksdf"));
        assertEquals("ksdf", SpaceRemover.removeV2("  ksdf"));
    }

    @Test
    void removeV1_4() {
        assertEquals("sf", SpaceRemover.removeV1(" sf "));
        assertEquals("sf", SpaceRemover.removeV2(" sf "));
    }

    @Test
    void removeV1_5() {
        assertEquals("sf", SpaceRemover.removeV1("  sf   "));
        assertEquals("sf", SpaceRemover.removeV2("  sf   "));
    }




}