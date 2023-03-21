package test;

import dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga1.getNome());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One Piece", 19.98));
        mangas.add(new Manga(6L, "Berseck", 12.20));
        mangas.add(new Manga(9L, "Pokemon", 12.99));
        mangas.add(new Manga(4L, "Attack on titan", 22.58));
        mangas.add(new Manga(11L, "Dragon Ball Z", 15.50));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------------------");
        Collections.sort(mangas, new MangaByNameComparator());
        //mangas.sort(new MangaByNameComparator());


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
