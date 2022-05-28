package pl.sdacademy.java.advanced.exercises.day1.extras.task3;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate orderDate;
    List<Product> products;


    public Order(Long id, LocalDate orderDate, List<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}
