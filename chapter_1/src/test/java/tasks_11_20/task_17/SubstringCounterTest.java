package tasks_11_20.task_17;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SubstringCounterTest {

    @Test
    void default_CountTest() {
        assertEquals(4, SubstringCounter.count("abc", "abcabcabcabc"));
    }

    @Test
    void noSubstring_CountTest() {
        assertThat(SubstringCounter.count("asdkfj", "asdjfa;sdf"), equalTo(0));
    }

    @Test
    void equStrAndSubstr_CountTest() {
        assertThat(SubstringCounter.count("abcdef", "abcdef"), is(1));
    }

    @Test
    void subStrGreaterThatStr_CountTest() {
        assertThat(SubstringCounter.count("asdf", "ab"), is(equalTo(0)));
    }


}