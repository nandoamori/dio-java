package exercicioPoo;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    

    public Pessoa(String no, int id, String sex) {
        this.nome = no;
        this.idade = id;
        this.sexo = sex;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String no) {
        this.nome = no;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int id) {
        this.idade = id;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sex) {
        this.sexo = sex;
    }



    public void fazerAniver(){
        this.idade++;
    }
}
