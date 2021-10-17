package tasks_11_20.task_16;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SubstringMatcherTest {

    @Test
    void defaultMatchTest() {
        assertEquals(Boolean.TRUE, SubstringMatcher.match("abc", "sdakfjaabc"));
    }

    @Test
    void noSubstringMatchTest() {
        assertNull(SubstringMatcher.match("aasdf", "sa"));
    }

    @Test
    void stringEqSubstringMatchTest() {
        assertEquals(Boolean.TRUE, SubstringMatcher.match("abc", "abc"));
    }

    @Test
    void eqLengthMatchTest() {
        assertEquals(Boolean.FALSE, SubstringMatcher.match("sadf", "sadd"));
    }

    @Test
    void substrGreaterThatStrMatchTest() {
        assertNull(SubstringMatcher.match("asdfjka;sdf", "aksdjf;as"));
    }


}