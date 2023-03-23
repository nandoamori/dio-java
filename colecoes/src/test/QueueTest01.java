package test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); // deve ter comparator
        fila.add("D");
        fila.add("B");
        fila.add("A");
        fila.add("N");
        fila.add("O");
        fila.add("Z");

    }
}
