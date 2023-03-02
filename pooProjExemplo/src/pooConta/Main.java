package pooConta;

public class Main {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(123);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");

        p1.depositar(100.00);

        p1.sacar(50.00);
        p1.informacoes();
    }
}
