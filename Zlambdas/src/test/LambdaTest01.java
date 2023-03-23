package test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Fernando", "Luffy", "Goku");
        List<Integer> integers = List.of(1, 3, 45, 7);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, (Integer s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
