package tasks_11_20.task_13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class CharRemoverTest {

    @Test
    void removeTest_1() {
        assertThat(CharRemover.removeV1('b', "ab"), equalTo("a"));
        assertThat(CharRemover.removeV2('b', "ab"), equalTo("a"));
    }

    @Test
    void removeTest_2() {
        assertThat(CharRemover.removeV1('g', "askdfjffffggggggg"), equalTo("askdfjffff"));
        assertThat(CharRemover.removeV2('g', "askdfjffffggggggg"), equalTo("askdfjffff"));
    }

}