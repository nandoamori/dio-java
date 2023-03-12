package exercicios.entities;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta especial: ";
        s += ", limite: " + limite;
        s += ". " + super.toString();
        return s;
    }

    @Override
    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;
        
            if ((saldoComLimite - valor) >= 0) {
                this.setSaldo(this.getSaldo() - valor);
                return true;
            }

        return false;
    }
}
