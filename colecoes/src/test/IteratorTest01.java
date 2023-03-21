package test;

import dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One Piece", 19.98, 0));
        mangas.add(new Manga(6L, "Berseck", 12.20, 12));
        mangas.add(new Manga(9L, "Pokemon", 12.99, 3));
        mangas.add(new Manga(4L, "Attack on titan", 22.58, 0));
        mangas.add(new Manga(11L, "Dragon Ball Z", 15.50, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        //mangas.removeIf(manga -> manga.getQuantidade() == 0); (funcional)
    }
}
