package test;

import dominio.Manga;
import dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
//utilizar treeSet qdo a classe implememta um comparable ou criar um comparator

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One Piece", 19.98));
        mangas.add(new Manga(6L, "Berseck", 12.20));
        mangas.add(new Manga(9L, "Pokemon", 12.99));
        mangas.add(new Manga(4L, "Attack on titan", 22.58));
        mangas.add(new Manga(11L, "Dragon Ball Z", 15.50));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(1L, "Yuyu Hakusho", 15.50, 8);
        System.out.println("===========================");
        System.out.println(mangas.lower(yuyu));
        System.out.println("===========================");
        System.out.println(mangas.floor(yuyu));
        System.out.println("===========================");
        System.out.println(mangas.higher(yuyu));
        System.out.println("===========================");
        System.out.println(mangas.ceiling(yuyu));
        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("===========================");

        //retornar e retirar primeiro elemento da lista
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        //retornar e retirar ultimo elemento da lista
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
