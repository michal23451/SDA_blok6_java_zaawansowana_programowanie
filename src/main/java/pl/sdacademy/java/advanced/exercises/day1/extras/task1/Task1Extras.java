package pl.sdacademy.java.advanced.exercises.day1.extras.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Task1Extras {

    public static List<String> search(List<String> values) {
        return values.stream()
                .filter(s -> s.startsWith("c"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static String getString(List<Integer> values) {
        return values.stream()
                .map(i -> i % 2 == 0 ? "e"+i : "o"+i)
                .collect(Collectors.joining(" "));
    }


}

