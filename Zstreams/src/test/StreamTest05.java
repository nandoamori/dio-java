package test;

import dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest05 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 5.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet", 8.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)

    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream() //com double 
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

    }
}
