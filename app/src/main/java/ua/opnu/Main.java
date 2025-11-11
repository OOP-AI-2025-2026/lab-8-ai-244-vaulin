package ua.opnu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");

        MyOptional<String> middleName = new MyOptional<>();
        System.out.println("middleName: " + middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse (якщо немає): " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println("\nusername: " + username);
        System.out.println("isPresent: " + username.isPresent());
        System.out.println("get(): " + username.get());
        System.out.println("orElse (якщо є): " + username.orElse("guest"));

        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток (немає значення): " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        System.out.println("\nЗавдання 2");

        BookData b1 = new BookData("Java", "Author A", 100, 450);
        BookData b2 = new BookData("Python", "Author B", 80, 400);

        System.out.println("Книга 1: " + b1);
        System.out.println("Книга 2: " + b2);
        System.out.println(b1.compareTo(b2) < 0 ? b1 + " дорожча за " + b2 : b2 + " дорожча за " + b1);

        System.out.println("\nЗавдання 4");

        String[] names = {"Anna", "Bob", "Alex", "Tom"};
        System.out.println("Початкові імена: " + Arrays.toString(names));

        String[] result = Filter.filter(names, n -> n.startsWith("A"));
        System.out.println("Імена на A: " + Arrays.toString(result));

        System.out.println("\nЗавдання 5");

        Integer[] nums = {1, 2, 3, 4};
        System.out.println("Масив чисел: " + Arrays.toString(nums));
        System.out.println("Містить 3? " + Contains.contains(nums, 3));
        System.out.println("Містить 5? " + Contains.contains(nums, 5));

        System.out.println("\nЗавдання 6");

        GenericTwoTuple<String, Integer> pair = new GenericTwoTuple<>("Alice", 25);
        System.out.println("Пара (ім’я + вік): " + pair);

        GenericThreeTuple<String, Integer, Double> triple = new GenericThreeTuple<>("Bob", 30, 95.5);
        System.out.println("Трійка (ім’я + вік + рейтинг): " + triple);
    }
}
