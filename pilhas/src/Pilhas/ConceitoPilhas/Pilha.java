package Pilhas.ConceitoPilhas;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top() { // mostra ultimo nó que foi empilhado
        return refNoEntradaPilha;
    }

    public void push(No novoNo) { //insere novo nó no topo da pilha (parametro No novoNo)
        No refAuxiliar = refNoEntradaPilha; // guarda referencia de entrada
        refNoEntradaPilha = novoNo; // pega referência de topo e seta como novo nó
        refNoEntradaPilha.setRefNo(refAuxiliar); // este novo nó que acabou de ser empilhado se torna referência
    }

    public No pop() { // remove ultimo nó a ser empilhado
        if (this.isEmpty()) {// primeiro verifico se a pilha está vazia
            No noPoped = refNoEntradaPilha; // guarda nó
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();//  referência de entrada agora é nó que estava abaixo do que foi removido
            return noPoped;
        }

        return null;
    }

    public boolean isEmpty() { //verifica se a pilha está vazia
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() { //aplica método toString

        String stringRetorno = "---------\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "---------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) { //faz loop até que retorne null que é a referência do último nó
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }

        }
        stringRetorno += "=========\n";
        return stringRetorno;
    }
}
