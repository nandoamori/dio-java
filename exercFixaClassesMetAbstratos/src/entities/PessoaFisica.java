package entities;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calcularImposto() {
   
        if (getRendaAnual() < 2000.00) {

           return getRendaAnual() * 0.15 - gastosSaude * 0.5;
        
        } else {
           return getRendaAnual() * 0.25 - gastosSaude * 0.5;
        }
    }

}
