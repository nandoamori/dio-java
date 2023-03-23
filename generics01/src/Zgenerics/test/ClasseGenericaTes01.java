package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTes01 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjDisponiveis();
        System.out.println("Ficou um mês com o carro...");
        System.out.println("-------");
        rentalService.devolverObjeto(carro);
    }
}
