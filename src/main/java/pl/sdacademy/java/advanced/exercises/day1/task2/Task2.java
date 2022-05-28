package pl.sdacademy.java.advanced.exercises.day1.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static List<String> sortUsingAnonymousClass(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareToIgnoreCase(o2); //a-z w naszym wypadku
                //return o2.compareToIgnoreCase(o1); //z-a w naszym wypadku
                return -o1.compareToIgnoreCase(o2); //z-a w naszym wypadku
            }
        });
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    public static List<String> sortUsingStream(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                //.sorted((o1, o2) -> o2.compareTo(o1))
                .sorted(new MyOwnComparator())
                .collect(Collectors.toList());
    }
}
