package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One Piece");
        mangas.add("Attack on titan");
        mangas.add("Berseck");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas); //ordenar por ordem alfabética

        for (String manga: mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.00);
        dinheiros.add(251.00);
        dinheiros.add(25.25);
        dinheiros.add(36.21);

        Collections.sort(dinheiros);//organiza do menor para o maior

        System.out.println(dinheiros);
    }
}
