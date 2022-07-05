package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.Serializable;

public class Car implements Serializable {
    private String producer;
    private String model;
    private int year;

    public Car(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }


}
