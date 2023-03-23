package classesInternas.test;

import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //barcos.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome())); lambda
        System.out.println(barcos);

    }
}
