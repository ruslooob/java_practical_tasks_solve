package tasks_11_20.task_15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringArrByLenSorterTest {

    @Test
    void sortTest_1() {
        assertEquals(List.of("asd", "aksdfj", "asdjfkasdjf"),
                StringArrByLenSorter.sort(new ArrayList<>(List.of("asdjfkasdjf", "aksdfj", "asd"))));
    }

}