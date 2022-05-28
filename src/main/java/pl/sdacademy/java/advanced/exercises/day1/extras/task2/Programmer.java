package pl.sdacademy.java.advanced.exercises.day1.extras.task2;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private Person person;
    private List<String> language;

    public Programmer(Person person, List<String> language) {
        this.person = person;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer " + person +
                ", language=" + language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(person, that.person) && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, language);
    }

    public Person getPerson() {
        return person;
    }

    public List<String> getLanguage() {
        return language;
    }
}
