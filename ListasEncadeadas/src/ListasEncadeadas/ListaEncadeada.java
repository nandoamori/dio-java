package ListasEncadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;// referência de entrada da lista

    public ListaEncadeada() {

        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No (conteudo) ;
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) { //criamos um nó como privado e passamos um índice para o mesmo
        validaIndice(index); //verificamos se índice é menor que o size
        No<T> noAuxiliar = referenciaEntrada;//criamos um nó auxiliar e passamos a referência de entrada para o mesmo
        No<T> noRetorno = null; // declaramos um nó genério para retorno
        for (int i = 0; i <= index; i++) { //
            noRetorno = noAuxiliar; // guardamos nó de retorno antes de fazermos passagem para próximo nó
            noAuxiliar = noAuxiliar.getProximoNo();//passamos para o próximo nó
        }
        return noRetorno;
    }

    public T remove(int index) {
        
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0; // iniciamos tamanho da lista como zero e o retornamos.

        No<T> referenciaAux = referenciaEntrada; // criamos referencia auxiliar e passamos a referencia de entrada para
                                                 // ele

        while (true) {
            if (referenciaAux != null) { // veificar se estamos no último nó
                tamanhoLista++; // incrementamos tamanho da lista
                if (referenciaAux.getProximoNo() != null) { // se o nó que está a frente é diferente de nulo, isso
                                                            // significa que temos um nó a frente
                    referenciaAux = referenciaAux.getProximoNo(); // se tivermos um próximo, temos que navegar até o
                                                                  // mesmo
                } else {
                    break;
                }
            } else {
                break;
            }
            return tamanhoLista;
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;////verificamos se índice é menor que o size
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index
                    + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
