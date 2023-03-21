package test;

import dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One Piece", 19.98));
        mangas.add(new Manga(6L, "Berseck", 12.20));
        mangas.add(new Manga(9L, "Pokemon", 12.99));
        mangas.add(new Manga(4L, "Attack on titan", 22.58));
        mangas.add(new Manga(11L, "Dragon Ball Z", 15.50));
        Collections.sort(mangas);

        Manga mangaToSearch = new Manga(5L, "One Piece", 19.98);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
