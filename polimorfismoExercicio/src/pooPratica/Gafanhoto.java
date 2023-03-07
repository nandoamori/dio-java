package pooPratica;

public class Gafanhoto extends Pessoa{

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }



    private String login;
    private int totAssistido;
    
    

    public String getLogin() {
        return login;
    }



    public void setLogin(String login) {
        this.login = login;
    }



    public int getTotAssistido() {
        return totAssistido;
    }



    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }



    @Override
    protected void ganharExp() {
    }



    @Override
    public String toString() {
        return "Gafanhoto [login=" + super.toString() + login + ",\n totAssistido=" + totAssistido + "]";
    }
    
    
}
