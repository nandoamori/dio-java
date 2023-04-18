package test;

import conn.ConnectionFactory;
import domain.Producer;
import repository.ProducerRepository;
import service.ProducerService;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerService.save(producer);
        //ProducerService.delete(1);
    }
}

