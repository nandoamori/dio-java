package emojiCombat;

import javax.annotation.processing.SupportedOptions;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador(String no, String nac, int id, double al, double pe,
            int vi, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2 ) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("-----------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " de altura");
        System.out.println("Pesando: " + this.getPeso() + " quilos");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("-----------------------");
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getAltura());
        System.out.println(this.getCategoria());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

}
