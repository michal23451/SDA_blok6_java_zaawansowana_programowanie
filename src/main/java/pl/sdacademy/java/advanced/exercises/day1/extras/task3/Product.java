package pl.sdacademy.java.advanced.exercises.day1.extras.task3;

public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

    public Product(Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
