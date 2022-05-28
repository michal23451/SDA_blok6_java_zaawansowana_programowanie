package pl.sdacademy.java.advanced.exercises.day1.task5;

public class Task5 {
    public static void main(String[] args) {
        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();

        sdaHashSet.add("aaa");
        sdaHashSet.add("bbb");
        sdaHashSet.add("ccc");
        System.out.println(sdaHashSet);
        sdaHashSet.remove("bbb");
        System.out.println(sdaHashSet);
        System.out.println(sdaHashSet.size());
        System.out.println(sdaHashSet.contains("xxx"));
        System.out.println(sdaHashSet.contains("aaa"));
        sdaHashSet.clear();
        System.out.println(sdaHashSet);


        SDAHashSet<String> sdaHashSet2 = new SDAHashSet<>();
        sdaHashSet2 = sdaHashSet;


    }
}
