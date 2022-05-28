package pl.sdacademy.java.advanced.exercises.day1.extras.task2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static List<Programmer> pointA(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender().equals("Man"))
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointB(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getAge() < 18)
                .filter(programmer -> programmer.getLanguage().contains("Java"))
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointC(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getLanguage().size() > 1)
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointD(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender().equals("Woman"))
                .filter(programmer -> programmer.getLanguage().contains("Java") && programmer.getLanguage().contains("C#"))
                .collect(Collectors.toList());
    }

    public static List<String> pointE(List<Programmer> programmers) {
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getGender().equals("Man"))
                .map(programmer -> programmer.getPerson().getName())
                .collect(Collectors.toList());
    }

    public static Set<String> pointF(List<Programmer> programmers) {
        return programmers.stream()
                .map(programmer -> programmer.getLanguage())
                .flatMap(stringList -> stringList.stream())
                .collect(Collectors.toSet());
    }

    public static List<String> pointG(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getLanguage().size() > 2)
                .map(p -> p.getPerson().getSurname())
                .collect(Collectors.toList());
    }

    public static boolean pointH(List<Programmer> programmers) {
        List<Programmer> tmp = programmers.stream()
                .filter(p -> p.getLanguage().size() == 0)
                .collect(Collectors.toList());
        return tmp.size() > 0 ? true : false;

        //lub
        //return programmers.stream()
        //        .anyMatch(p -> p.getLanguage().size() == 0);

    }

    public static int pointI(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getGender().equals("Woman"))
                .map (p -> p.getLanguage())
                .flatMap(stringList -> stringList.stream())
                .distinct()
                .collect(Collectors.toList())
                .size();

        /*
        return (int) programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Women"))
                .filter(p -> !p.getProgrammingLanguages().isEmpty())
                .map(Programmer::getProgrammingLanguages)
                .distinct()
                .count();
         */
    }


}
