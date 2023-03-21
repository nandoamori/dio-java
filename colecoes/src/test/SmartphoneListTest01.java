package test;

import dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1f21d121", "iPhone");
        Smartphone s2 = new Smartphone("1f14415df1", "Pixel");
        Smartphone s3 = new Smartphone("1dsf58fs121", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("25g155", "Nokia");

        System.out.println(smartphones.contains(s4));

        int indexS4 = smartphones.indexOf(s4);
        System.out.println(indexS4);
    }
}
