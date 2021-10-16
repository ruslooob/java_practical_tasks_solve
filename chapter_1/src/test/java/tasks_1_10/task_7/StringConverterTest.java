package tasks_1_10.task_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    void convertTest_1() {
        String str = "6";
        assertAll(
                () -> assertEquals(6, StringConverter.toInteger(str)),
                () -> assertEquals(6L, StringConverter.toLong(str)),
                () -> assertEquals(6F, StringConverter.toFloat(str)),
                () -> assertEquals(6., StringConverter.toDouble(str))
        );
    }

    @Test
    void convertTest_2() {
        String str = "";
        assertAll(
                () -> assertThrows(NumberFormatException.class, () -> StringConverter.toInteger(str)),
                () -> assertThrows(NumberFormatException.class, () -> StringConverter.toLong(str)),
                () -> assertThrows(NumberFormatException.class, () -> StringConverter.toFloat(str)),
                () -> assertThrows(NumberFormatException.class, () -> StringConverter.toDouble(str))
        );
    }

    @Test
    void convertTest_3() {
        String str = "6";
        assertAll(
                () -> assertEquals(6, StringConverter.toInteger(str)),
                () -> assertEquals(6L, StringConverter.toLong(str)),
                () -> assertEquals(6F, StringConverter.toFloat(str)),
                () -> assertEquals(6., StringConverter.toDouble(str))
        );
    }

    @Test
    void convertTest_4() {
        String str = "6541";
        assertAll(
                () -> assertEquals(6541, StringConverter.toInteger(str)),
                () -> assertEquals(6541L, StringConverter.toLong(str)),
                () -> assertEquals(6541.F, StringConverter.toFloat(str)),
                () -> assertEquals(6541., StringConverter.toDouble(str))
        );
    }

    @Test
    void convertTest_5() {
        String str = "456";
        assertAll(
                () -> assertEquals(456, StringConverter.toInteger(str)),
                () -> assertNotEquals(6L, StringConverter.toLong(str)),
                () -> assertNotEquals(656, StringConverter.toFloat(str)),
                () -> assertNotEquals(6., StringConverter.toDouble(str))
        );
    }
}