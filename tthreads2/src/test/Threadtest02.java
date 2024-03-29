package test;

import dominio.MinhaThreadRunnable;

public class Threadtest02 {
    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 300);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); //indica que queremos esperar a execução finalizar para iniciar próxima tarefa
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Programa finalizado.");
    }
}
