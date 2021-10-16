package tasks_1_10.task_9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class StringJoinerTest {

    @Test
    void joinV1_1() {
        List<String> strings = List.of("a", "b", "c", "d");
        String delimiter = "|";
        assertThat(StringJoiner.joinV1(delimiter, strings), equalTo("a|b|c|d"));
    }

    @Test
    void joinV1_2() {
        List<String> strings = List.of("H", "e", "l", "l", "o");
        String delimiter = "|";
        assertThat(StringJoiner.joinV1(delimiter, strings), equalTo("H|e|l|l|o"));
    }

    @Test
    void joinV1_3() {
        List<String> strings = List.of();
        String delimiter = "|";
        assertThat(StringJoiner.joinV1(delimiter, strings), equalTo(""));
    }

    @Test
    void joinV1_4() {
        List<String> strings = List.of("a", "b", "c", "d");
        String delimiter = "|afs";
        assertThat(StringJoiner.joinV1(delimiter, strings), equalTo("a|afsb|afsc|afsd"));
    }

}