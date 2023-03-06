package teoria.metodosComParametro;

public class Carro {
     String marca; //atributos
     String modelo;
     int numPassageiros;
     double capacidCombustivel;
     double consumoCombustivel;

    public void exibirAutonomia(){ // método sem retorno
        System.out.println("A autonomia do carro é  " + capacidCombustivel*consumoCombustivel + " km.");
    }

    public double obterAutonomia(){
        System.out.println("Método com retorno");
        return capacidCombustivel*consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}