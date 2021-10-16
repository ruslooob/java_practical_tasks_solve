package tasks_11_20.task_12;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class RepeatedCharRemoverTest {

    @Test
    void removeTest_1() {
        assertThat(RepeatedCharRemover.remove("aabbccdd"), equalTo("abcd"));
    }

    @Test
    void removeTest_2() {
        assertThat(RepeatedCharRemover.remove("asdk;fja;ksdjf;ajds"), equalTo("asdk;fj"));
    }

    @Test
    void removeTest_3() {
        assertThat(RepeatedCharRemover.remove(";;;;;;;;;;;;;;;"), equalTo(";"));
    }

    @Test
    void removeTest_4() {
        assertThat(RepeatedCharRemover.remove(""), equalTo(""));
    }

}