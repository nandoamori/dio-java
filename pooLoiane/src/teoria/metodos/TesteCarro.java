package teoria.metodos;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capacidCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia é: " + autonomia);
    }
}
