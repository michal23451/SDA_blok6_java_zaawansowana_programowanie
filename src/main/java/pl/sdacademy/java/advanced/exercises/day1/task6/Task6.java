package pl.sdacademy.java.advanced.exercises.day1.task6;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task6 {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "aaa");
        treeMap.put("2", "bbb");
        treeMap.put("3", "ccc");
        treeMap.put("4", "ddd");
        treeMap.put("5", "eee");

        printFirstAndLastElement(treeMap);
    }

    public static void printFirstAndLastElement(TreeMap/*<?, ?>*/ treeMap) {
        Entry firstElement = treeMap.firstEntry();
        Entry lastElement = treeMap.lastEntry();
        System.out.println("first: " + firstElement + "\nlast: " + lastElement);
    }

}
