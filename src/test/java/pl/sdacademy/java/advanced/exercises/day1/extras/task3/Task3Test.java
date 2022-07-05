package pl.sdacademy.java.advanced.exercises.day1.extras.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Task3Test {
    private List<Product> products;
    private List<Order> orders;
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private Product product5;
    private Product product6;
    private Product product7;
    private Order order1;
    private Order order2;
    private Order order3;
    private Order order4;
    private Order order5;


    @BeforeEach
    void setUp() {
        product1 = new Product(1L, "AAA", "Computer", 2500);
        product2 = new Product(2L, "BBB", "Computer", 5001);
        product3 = new Product(3L, "CCC", "Computer", 1000);
        product4 = new Product(4L, "DDD", "Computer", 9000);
        product5 = new Product(5L, "EEE", "Book", 8000);
        product6 = new Product(6L, "FFF", "Computer", 5000);
        product7 = new Product(7L, "GGG", "Phone", 3000);

        order1 = new Order(1l, LocalDate.of(2022, 01, 15), List.of(product1, product2, product3, product4));
        order2 = new Order(2l, LocalDate.of(2022, 01, 5), List.of(product1, product2, product3, product4, product5));
        order3 = new Order(3l, LocalDate.of(2022, 05, 5), List.of(product5));
        order4 = new Order(4l, LocalDate.of(2022, 02, 15), List.of(product5, product6));
        order5 = new Order(5l, LocalDate.of(2022, 03, 15), List.of(product7));

        products = List.of(product1, product2, product3, product4, product5, product6, product7);
        orders = List.of(order1, order2, order3, order4, order5);
    }

    @Test
    void shouldReturnCorrectResultA() {
        //given
        List<Product> result = new ArrayList<>();
        //when
        result = Task3.pointA(products);
        //then
        assertThat(result).containsExactlyInAnyOrder(product2, product4);
    }

    @Test
    void shouldReturnCorrectResultB() {
        //given
        List<Product> result = new ArrayList<>();
        List<Product> expectedResult = List.of(
                new Product(1L, "AAA", "Computer", 2500 * 0.8),
                new Product(2L, "BBB", "Computer", 5001 * 0.8),
                new Product(3L, "CCC", "Computer", 1000 * 0.8),
                new Product(4L, "DDD", "Computer", 9000 * 0.8),
                new Product(6L, "FFF", "Computer", 5000 * 0.8)
        );
        //when
        result = Task3.pointB(products);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectResultC() {
        //given
        Product result;
        //when
        result = Task3.pointC(products);
        //then
        assertThat(result.getPrice()).isEqualTo(1000);
        assertThat(result).isEqualTo(product3);
    }

    @Test
    void shouldReturnCorrectResultD() {
        //given
        List<Order> result;
        //when
        result = Task3.pointD(orders);
        //then
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0)).isEqualTo(order2);
        assertThat(result.get(1)).isEqualTo(order3);
        assertThat(result.get(2)).isEqualTo(order4);
        assertThat(result).containsExactlyInAnyOrder(order3, order2, order4);
    }


    @Test
    void shouldReturnCorrectResultE() {
        //given
        List<Product> result;
        //when
        result = Task3.pointE(orders);
        //then
        assertThat(result.size()).isEqualTo(5);
        assertThat(result).containsExactlyInAnyOrder(product1, product2, product3, product4, product5);
    }

    @Test
    void shouldReturnCorrectResultF() {
        //given
        List<Order> result;
        //when
        result = Task3.pointF(orders);
        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).containsExactlyInAnyOrder(order3, order5);
    }

    @Test
    void shouldReturnCorrectResultG() {
        //given
        double result;
        //when
        result = Task3.pointG(orders);
        //then
        assertThat(result).isEqualTo(25501.0);
    }



}