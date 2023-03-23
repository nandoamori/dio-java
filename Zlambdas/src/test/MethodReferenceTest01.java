package test;

import Dominio.Anime;
import service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserck", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareBytitle);
        //animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
