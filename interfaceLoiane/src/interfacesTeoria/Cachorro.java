package interfacesTeoria;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String tamanho;
    private String raca;

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaça(String raça) {
        this.raca = raça;
    }

    @Override
    public void amamentar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
    }
    @Override
    public void brincar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brincar'");
    }
    @Override
    public void levarPassear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levarPassear'");
    }
    @Override
    public void levarVeterinario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levarVeterinario'");
    }
    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
    }

    
}