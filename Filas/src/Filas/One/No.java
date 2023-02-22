package Filas.One;

public class No<T> {
    private T object; // criamos o objeto (conteúdo do nó)
    private No<T> refNo; // criamos referência de nó

    public No() { //criamos construtor
    }

    public No(T object) { //criamos construtor
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() { //criamos getters and setters
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() { //criamos toString da classe nó
        return "No [object=" + object + "]";
    }

    

    
}
