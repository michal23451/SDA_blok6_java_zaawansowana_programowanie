package pl.sdacademy.java.advanced.exercises.day1.extras.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("aaa");
        listString.add("bb");
        listString.add("ccc");
        listString.add("cccc");
        listString.add("ddd");
        listString.add("eeeeeeeeeee");
        listString.add("cxx");
        listString.add("fff");

        System.out.println(listString);
        System.out.println(Task1Extras.search(listString));



        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(12);
        listInteger.add(55);
        listInteger.add(3);
        listInteger.add(8);
        listInteger.add(999998);
        listInteger.add(1);
        listInteger.add(32);
        listInteger.add(0);

        System.out.println(listInteger);
        System.out.println(Task1Extras.getString(listInteger));
    }
}
