package pl.sdacademy.java.advanced.exercises.day1.extras.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {
    private List<Programmer> programmers;
    private Programmer programmer1;
    private Programmer programmer2;
    private Programmer programmer3;
    private Programmer programmer4;
    private Programmer programmer5;
    private Programmer programmer6;

    @BeforeEach
    void setUp() {
        Person person1 = new Person("aaa", "bbb", "Woman", 15);
        Person person2 = new Person("ccc", "ddd", "Woman", 35);
        Person person3 = new Person("eee", "fff", "Woman", 18);
        Person person4 = new Person("ggg", "hhh", "Man", 25);
        Person person5 = new Person("iii", "jjj", "Woman", 50);
        Person person6 = new Person("kkk", "lll", "Man", 12);

        programmer1 = new Programmer(person1, List.of("Java"));
        programmer2 = new Programmer(person2, List.of());
        programmer3 = new Programmer(person3, List.of("C#"));
        programmer4 = new Programmer(person4, List.of("C#", "Java"));
        programmer5 = new Programmer(person5, List.of("C#", "Java", "Python"));
        programmer6 = new Programmer(person6, List.of("JavaScript", "C", "Java"));

        programmers = List.of(programmer1, programmer2, programmer3, programmer4, programmer5, programmer6);
    }

    @Test
    void shouldReturnCorrectListForPointA() {
        //when
        List<Programmer> result = Task2.pointA(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder(programmer4, programmer6);
    }

    @Test
    void shouldReturnCorrectListForPointB() {
        //when
        List<Programmer> result = Task2.pointB(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder(programmer1, programmer6);
    }

    @Test
    void shouldReturnCorrectListForPointC() {
        //when
        List<Programmer> result = Task2.pointC(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder(programmer4, programmer5, programmer6);
    }

    @Test
    void shouldReturnCorrectListForPointD() {
        //when
        List<Programmer> result = Task2.pointD(programmers);
        //then
        assertThat(result).contains(programmer5);
    }

    @Test
    void shouldReturnCorrectListForPointE() {
        //when
        List<String> result = Task2.pointE(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder("ggg", "kkk");
    }

    @Test
    void shouldReturnCorrectListForPointF() {
        //when
        Set<String> result = Task2.pointF(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder("Java", "C#", "Python", "JavaScript", "C");
    }

    @Test
    void shouldReturnCorrectListForPointG() {
        //when
        List<String> result = Task2.pointG(programmers);
        //then
        assertThat(result).containsExactlyInAnyOrder("jjj", "lll");
    }

    @Test
    void shouldReturnCorrectListForPointH() {
        //when
        boolean result = Task2.pointH(programmers);
        //then
        assertThat(result).isTrue();

    }

    @Test
    void shouldReturnCorrectListForPointI() {
        //when
        int result = Task2.pointI(programmers);
        //then
        assertThat(result).isEqualTo(3);
    }

}