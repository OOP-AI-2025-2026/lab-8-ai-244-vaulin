package ua.opnu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> T[] filter(T[] arr, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T elem : arr) {
            if (condition.test(elem)) {
                result.add(elem);
            }
        }
        return result.toArray(java.util.Arrays.copyOf(arr, result.size()));
    }
}

