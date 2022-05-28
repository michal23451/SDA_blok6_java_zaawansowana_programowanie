package pl.sdacademy.java.advanced.exercises.day1.task5;

import java.util.HashSet;

public class SDAHashSet<T> {

    private final HashSet<T> hashSet = new HashSet<>();

    public boolean add(T t){
        return hashSet.add(t);
    }

    public boolean remove(T t){
        return hashSet.remove(t);
    }

    public int size() {
        return hashSet.size();
    }

    public boolean contains(T t) {
        return hashSet.contains(t);
    }

    public void clear() {
        hashSet.clear();
    }



    @Override
    public String toString() {
        return "SDAHashSet{" +
                "hashSet=" + hashSet +
                '}';
    }
}
