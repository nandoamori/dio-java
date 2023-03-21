package test;

import dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //não permite elementos duplicados, organizados pelo hash
        mangas.add(new Manga(5L, "One Piece", 19.98, 0));
        mangas.add(new Manga(6L, "Berseck", 12.20, 12));
        mangas.add(new Manga(9L, "Pokemon", 12.99, 3));
        mangas.add(new Manga(4L, "Attack on titan", 22.58, 0));
        mangas.add(new Manga(11L, "Dragon Ball Z", 15.50, 0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
