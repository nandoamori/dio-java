package exercicios.entities;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste conta bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Adriano");
        contaSimples.setNumConta(1111);

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);


        System.out.println(contaSimples);
        
        System.out.println();
        System.out.println("*** Teste conta poupança ***");

        ContaPoupanca contaPoup = new ContaPoupanca();
        contaPoup.setNomeCliente("Julia");
        contaPoup.setNumConta(2222);
        contaPoup.setDiaRendimento(11);

        contaPoup.depositar(100);

        realizarSaque(contaPoup, 50);
        realizarSaque(contaPoup, 70);

        if (contaPoup.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado. Novo saldo: " + contaPoup.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento.");
        }


        System.out.println(contaPoup);

        System.out.println();
        System.out.println("*** Teste conta especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Juliano");
        contaEspecial.setNumConta(3333);
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);


        System.out.println(contaEspecial);
    }
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para sacar: " + valor + ". Saldo da conta: " + conta.getSaldo());
        }

    }
}
