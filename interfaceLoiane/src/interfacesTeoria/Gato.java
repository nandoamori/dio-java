package interfacesTeoria;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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
