package test;

import domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .withFirstName("Fernando")
                .withLastName("Amorim")
                .withUsername("nandoamori")
                .withEmail("nandoamori@rmail.com")
                .build();
        System.out.println(build);
    }
}
