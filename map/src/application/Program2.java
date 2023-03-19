package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import entities.ComparatorNome;
import entities.Livros;

public class Program2 {
    public static void main(String[] args) {
        Map<String, Livros> meusLivros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livros("Uma breve história do tempo", 256));
                put("Duhigg", new Livros("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livros("21 lições para o século 21", 432));
            }
        };
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("===============================");
        System.out.println("Exiba por ordem de inserção: ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephen", new Livros("Uma breve história do tempo", 256));
                put("Duhigg", new Livros("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livros("21 lições para o século 21", 432));
            }
        };
        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("===============================");
        System.out.println("Exiba por ordem alfabética dos autores: ");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("===============================");
        System.out.println("Exiba por ordem alfabética dos nomes dos livros: ");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("===============================");

    }
}
