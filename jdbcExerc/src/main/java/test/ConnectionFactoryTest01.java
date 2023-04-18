package test;

import conn.ConnectionFactory;
import domain.Producer;
import repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer nhk = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(nhk);
    }
}

