package pl.sdacademy.java.advanced.exercises.day1.extras.task3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<Product> pointA(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 5000)
                .filter(p -> p.getCategory().equals("Computer"))
                .collect(Collectors.toList());
    }

    public static List<Product> pointB(List<Product> products) {
        //products.forEach(p -> p.setPrice(p.getPrice() * 0.8));
        return products.stream()
                .filter(p -> p.getCategory().equals("Computer"))
                .peek(p -> p.setPrice(p.getPrice() * 0.8)) //tutaj nie można forEach, bo zwraca void a nie stream
                //lub
                //.map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice()*0.8))
                .collect(Collectors.toList());
    }

    public static Product pointC(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals("Computer"))
                .min(Comparator.comparingDouble(p -> p.getPrice()))
                //.min(Comparator.comparing(p -> p.getPrice()))
                //.min(Comparator.comparing(Product::getPrice))
                .get();
    }

    public static List<Order> pointD(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        //.filter(product -> product.getCategory().equals("Book")) //nie działa
                        .anyMatch(product -> product.getCategory().equals("Book"))
                )
                .collect(Collectors.toList());

    }

    public static List<Product> pointE(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2022, 01, 01)) &&
                        order.getOrderDate().isBefore(LocalDate.parse("2022-02-01")))
                .map(order -> order.getProducts())
                .flatMap(productList -> productList.stream())
                //lub zamiast dwóch powyższych ta jedna linia: .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Order> pointF(List<Order> orders) {
        return orders.stream()
                .sorted(new Comparator<Order>() {
                    @Override
                    public int compare(Order o1, Order o2) { //sortowanie odwrotne - od najstarszego do najmłodszego
                        if (o1.getOrderDate().isAfter(o2.getOrderDate())) {
                            return -1;
                        } else if (o1.getOrderDate().isBefore(o2.getOrderDate())) {
                            return 1;
                        } else { //gdy (o1.getOrderDate().equals(o2.getOrderDate()))
                            return 0;
                        }
                    }
                })
                //lub zamiast powyższego
                //.sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }

    public static double pointG(List<Order> orders) {
        return orders.stream()
                .min(new Comparator<Order>() {
                    @Override
                    public int compare(Order o1, Order o2) {
                        if (o1.getOrderDate().isAfter(o2.getOrderDate())) {
                            return 1;
                        } else if (o1.getOrderDate().isBefore(o2.getOrderDate())) {
                            return -1;
                        } else { //gdy (o1.getOrderDate().equals(o2.getOrderDate()))
                            return 0;
                        }
                    }
                })
                .map(order -> order.getProducts())
                .stream().toList()
                .stream().flatMap(products -> products.stream())
                .mapToDouble(Product::getPrice)
                .sum();

    }


    public static double pointGTrener(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate))
                .limit(1)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }

}
