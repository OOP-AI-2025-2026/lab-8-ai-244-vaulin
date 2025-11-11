package ua.opnu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Завдання 1
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username);
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        // Завдання 2
        BookData b1 = new BookData("Java", "Author A", 100, 450);
        BookData b2 = new BookData("Python", "Author B", 80, 400);
        System.out.println(b1.compareTo(b2) < 0 ? b1 + " > " + b2 : b2 + " > " + b1);

        // Завдання 4
        String[] names = {"Anna", "Bob", "Alex", "Tom"};
        String[] result = Filter.filter(names, n -> n.startsWith("A"));
        System.out.println(Arrays.toString(result));

        // Завдання 5
        Integer[] nums = {1, 2, 3, 4};
        System.out.println(Contains.contains(nums, 3));
        System.out.println(Contains.contains(nums, 5));

        // Завдання 6
        GenericTwoTuple<String, Integer> pair = new GenericTwoTuple<>("Alice", 25);
        System.out.println(pair);

        GenericThreeTuple<String, Integer, Double> triple = new GenericThreeTuple<>("Bob", 30, 95.5);
        System.out.println(triple);
    }
}
