package exercicios.entities;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;


    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        String s = "";
        s += "nome do cliente: " + nomeCliente;
        s +=  "; numConta: " + numConta;
        s += "; saldo: " + saldo;
        return s;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

}
