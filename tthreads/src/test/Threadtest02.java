package test;

import dominio.MinhaThreadRunnable;

public class Threadtest02 {
    public static void main(String[] args) {
        //três tarefas diferentes, cada uma sendo executada a seu tempo
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 300);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 900);
    }
}
