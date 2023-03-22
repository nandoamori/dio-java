package test;

import dominio.Consumidor;
import dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest02 {
    public static void main(String[] args) {
        Consumidor cs1 = new Consumidor("Fernando");
        Consumidor cs2 = new Consumidor("Jaime");

        Manga manga1 = new Manga(5L, "One Piece", 19.98);
        Manga manga2 = new Manga(6L, "Berseck", 12.20);
        Manga manga3 = new Manga(9L, "Pokemon", 12.99);
        Manga manga4 = new Manga(4L, "Attack on titan", 22.58);
        Manga manga5 = new Manga(11L, "Dragon Ball Z", 15.50);

        List<Manga> mangaConsumidor01 = List.of(manga1, manga3, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(cs2, mangaConsumidor01);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga: entry.getValue()){
                System.out.println(manga.getNome());
            }
        }



    }
}
