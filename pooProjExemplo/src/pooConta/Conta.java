package pooConta;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status = false;

    // abrirConta()
    // fecharConta()
    // depositar()
    // sacar()
    // pagarMensal()
    // se abrir corrente ganha 50 reais, poupança ganha 150

    public Conta() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
        }
    }

    public void depositar(double v) {
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar");            
        }
    }

    public void sacar(double v) {
        if (this.getStatus() == true) {
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        int v = 0;

        if(this.getTipo() == "cc"){
            v = 12;
        }else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus() == true) {
            if(this.getSaldo() > v){
                this.setSaldo(saldo - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public void informacoes(){
        System.out.println("Abri uma conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Dono: " + this.getDono());
    }
}
