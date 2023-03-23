package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcosList = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcosList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
