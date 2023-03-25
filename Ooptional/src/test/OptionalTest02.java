package test;

import dominio.Manga;
import repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        MangaRepositorio.findById(2).orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepositorio.findByTitle("One Piece")
                .orElse(new Manga(3, "One Piece", 1500));
        System.out.println(newManga);
    }
}
