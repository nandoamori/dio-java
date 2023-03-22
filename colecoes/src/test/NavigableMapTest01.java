package test;

import dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap();
        map.put("A", "Letra a");
        map.put("B", "Letra b");
        map.put("C", "Letra c");
        map.put("D", "Letra d");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("C", true));
    }
}
