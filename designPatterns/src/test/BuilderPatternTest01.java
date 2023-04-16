package test;

import domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.builder()
                .firstName("Fernando")
                .lastName("Amorim")
                .username("nandoamori")
                .email("nandoamori@rmail.com")
                .build();
        System.out.println(build);
    }
}
