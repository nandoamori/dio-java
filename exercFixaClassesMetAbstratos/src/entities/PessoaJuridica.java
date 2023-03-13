package entities;

public class PessoaJuridica extends Pessoa {
    private int numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
    
    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
        @Override
        public Double calcularImposto() {
           if (numeroFuncionarios < 10) {
              return getRendaAnual() * 0.14;
           } else{
            return getRendaAnual() * 0.16;
           }
        }

}
