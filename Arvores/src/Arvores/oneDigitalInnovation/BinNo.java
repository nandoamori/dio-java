package Arvores.oneDigitalInnovation;

import org.w3c.dom.Node;

public class BinNo<T extends Comparable<T>> {
    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) { //gera construtor 
        this.conteudo = conteudo;
        noEsq = noDir = null; //seta os nós começando com nulo
    }

    public BinNo(){ //gera construtor simples
    }

    public T getConteudo() { //gera getters and setters
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override //gera toString()
    public String toString() {
        return "BinNo [conteudo=" + conteudo + "]";
    }

    
    
    


}
