package br.cefetmg.inf.lab20250609;

public class ListaArray {
    int[] itens;
    int qntElementos;
    int tamanho;

    ListaArray() {
        tamanho = 10;
        itens = new int[tamanho];
        qntElementos = 0;
    }

    void inserirInicio(int valor) {
        inserirMeio(0, valor); 
    }

    void inserirMeio(int posicao, int valor) {
        if (posicao < 0 || posicao > qntElementos) {
            return;
        }

        if (qntElementos == tamanho) {
            redimensionar();
        }

        for (int i = qntElementos; i > posicao; i--) {
            itens[i] = itens[i - 1];
        }

        itens[posicao] = valor;
        qntElementos++;
    }

    void inserirFim(int valor) {
        inserirMeio(qntElementos, valor);
    }

    Integer removerInicio() {
        if (estaVazia()) {
            return null;
        }
        return removerMeio(0);
    }

    Integer removerMeio(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= qntElementos) {
            return null;
        }

        int retorno = itens[posicao];

        for (int i = posicao; i < qntElementos - 1; i++) {
            itens[i] = itens[i + 1];
        }

        qntElementos--;
        return retorno;
    }

    Integer removerFim() {
        if (estaVazia()) {
            return null;
        }
        return removerMeio(qntElementos - 1);
    }

    Integer consultarInicio() {
        if (estaVazia()) {
            return null;
        }
        return consultarMeio(0);
    }

    Integer consultarMeio(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= qntElementos) {
            return null;
        }
        return itens[posicao];
    }

    Integer consultarFim() {
        if (estaVazia()) {
            return null;
        }
        return consultarMeio(qntElementos - 1);
    }

    boolean estaVazia() {
        return qntElementos == 0;
    }

    int pesquisarItem(int item) {
        for (int i = 0; i < qntElementos; i++) {
            if (itens[i] == item) {
                return i;
            }
        }
        return -1;
    }

    void imprimirLista() {
        for (int i = 0; i < qntElementos; i++) {
            System.out.print(itens[i] + " ");
        }
        System.out.println();
    }

    void redimensionar() {
        tamanho += tamanho;
        int[] novoArray = new int[tamanho];

        for (int i = 0; i < qntElementos; i++) {
            novoArray[i] = itens[i];
        }

        itens = novoArray;
    }
}
