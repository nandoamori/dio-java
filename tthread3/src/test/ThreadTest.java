package test;

import dominio.MinhaThreadRunnable;

public class ThreadTest {
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

       // t1.setPriority(5);

       t1.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.NORM_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
    }
}
