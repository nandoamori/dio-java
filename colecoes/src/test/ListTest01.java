package test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Fernando");
        nomes.add("Julia");
        nomes2.add("Carlos");
        nomes2.add("Maria");

        nomes2.addAll(nomes);


        for ( String nome : nomes ) {
            System.out.println(nome);
        }
        System.out.println("=========================");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("=========================");
        for ( String nome : nomes2 ) {
            System.out.println(nome);
        }
    }
}
