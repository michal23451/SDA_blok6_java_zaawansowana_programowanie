package pl.sdacademy.java.advanced.exercises.day1.extras.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<Product> pointA(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 5000)
                .filter(p -> p.getCategory().equals("Computer"))
                .collect(Collectors.toList());
    }

}
