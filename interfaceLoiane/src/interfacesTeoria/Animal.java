package interfacesTeoria;

public abstract class Animal {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
}
