package pl.sdacademy.java.advanced.exercises.day1.task2;

import org.junit.jupiter.api.Test;
import pl.sdacademy.java.advanced.exercises.day1.task2.Task2;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    private final static List<String> UNSORTED = List.of("A", "a", "B", "b", "Z", "z", "C", "c", "D", "d");
    private final static List<String> SORTED = List.of("Z", "z", "D", "d", "C", "c", "B", "b", "A", "a");

    @Test
    void shouldReverseListOfStrings_usingAnonymousClass() {
        //when
        List<String> result = Task2.sortUsingAnonymousClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(SORTED);
    }

    @Test
    void shouldReverseListOfStrings_usingOwnComparator() {
        //when
        List<String> result = Task2.sortUsingOwnComparator(UNSORTED);
        //then
        assertThat(result).isEqualTo(SORTED);
    }

    @Test
    void shouldReverseListOfStrings_usingStream() {
        //when
        List<String> result = Task2.sortUsingStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(SORTED);
    }

}