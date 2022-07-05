package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Task32 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Mercedes", "GLS", 2018);
        Car car2 = new Car("Fiat", "Punto", 2010);
        Car car3 = new Car("Audi", "A7", 2016);
        Car car4 = new Car("Renault", "Megane", 2018);
        Car car5 = new Car("Opel", "Insignia", 2019);

        cars = List.of(car1, car2, car3, car4, car5);



    }
}