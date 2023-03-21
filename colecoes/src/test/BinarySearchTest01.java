package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(0);
        numeros.add(3);
        //se não encontra, retorna: (-(ponto de inserção) -1)
        Collections.sort(numeros); // tem que utilizar ordenação
        System.out.println(Collections.binarySearch(numeros, 2));
        System.out.println(Collections.binarySearch(numeros, 1));


    }
}
