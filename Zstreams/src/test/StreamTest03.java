package test;

import dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest03 {
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
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
