package relacionamento.entities;

public class Telefone {
    private String tipo;
    private int ddd;
    private int numero;

    
    public Telefone() {
        
    }

    

    public Telefone(String tipo, int ddd, int numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }



    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
}
