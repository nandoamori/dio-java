package exercicioRelacionamento.entities;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    



    public Agenda(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getInfo(){
        String info = "Nome: " + nome + "\n";
        if(contatos != null){
            for (Contato c : contatos) {
                info+= c.getInfo() + "\n";
            }
        }

        return info;
    }
    


}
