package Filas.One;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;//implemenamos referencia de entrada na fila

    public Fila() { //cria construtor vazio
        this.refNoEntradaFila = null; 
    }

    public void enqueue(T object) { // enfileirar, novo nó como parâmetro
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila); // setar referência de entrada do novo nó como o antigo ultimo nó da fila
        refNoEntradaFila = novoNo; // referência de entrada na fila é o novo nó 
    }

    public T first() {
        if(!this.isEmpty()){//verifica se esta vazia
            No primeiroNo = refNoEntradaFila; // primeiro nó se torna referencia de entrada na fila
            while (true) {
                if (primeiroNo.getRefNo() != null) { //se estiver null, testa nó da frente
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()){//verifica se esta vazia
            No primeiroNo = refNoEntradaFila; // primeiro nó se torna referencia de entrada na fila
            No noAuxiliar = refNoEntradaFila; // 
            while (true) {
                if (primeiroNo.getRefNo() != null) { //se estiver null, testa nó da frente
                    noAuxiliar = primeiroNo;//guardar primeiro nó em nó auxiliar
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null); //seta referência para novo primeiro nó
                    break;
                }
                
            }
            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public boolean isEmpty() { //verifica se fila está vazia
        return refNoEntradaFila == null? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
    
    
}
