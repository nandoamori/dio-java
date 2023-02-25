package Arvores.oneDigitalInnovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() { // construtor
        this.raiz = null; // seta raiz de arvore como nulo
    }

    public void inserir(T conteudo) { // recebe conteudo do tipo genérico
        BinNo<T> novoNo = new BinNo<>(conteudo); // cria novo nó com conteudo
        raiz = inserir(raiz, novoNo); // raiz receberá novo nó, através da chamada do método inserir
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {// método inserir
        if (atual == null) { // verifica se raiz é == nulo
            return novoNo; // se estiver vazia, insere novo nó
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {// verificando se conteúdo do novo nó é
                                                                             // maior que conteudo de nó atual
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));// se conteudo for menor, coloca-o a esquerda
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));// se for maior, coloca-o a direita
        }
        return atual;
    }

    // exibição em ordem

    public void exibirInOrdem() {
        System.out.println("\n Exibindo em ordem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + " , ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    // exibir pós ordem

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo pos ordem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + " , ");
        }
    }

    // exibir pré ordem

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo pré ordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + " , ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    // método remove()

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho
                            .getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho
                        .getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }
        } catch (NullPointerException erro) {
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}
