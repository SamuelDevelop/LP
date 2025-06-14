
package br.cefetmg.inf.lab20250609;

class No {
    int item;
    No proximo;

    No(int item) {
        this.item = item;
        this.proximo = null;
    }
}

public class ListaEncadeada {
    int qntElementos;
    No topo;
    No fim;

    ListaEncadeada() {
        qntElementos = 0;
        topo = null;
        fim = null;
    }

    void inserirInicio(int valor) {
        inserirMeio(0, valor);
    }

    void inserirMeio(int posicao, int valor) {

        No novoNo = new No(valor);

        if (estaVazia()) {
            topo = novoNo;
            fim = novoNo;
        } else if (posicao == 0) { // Inserir no início
            novoNo.proximo = topo;
            topo = novoNo;
        } else {
            No aux = topo;
            No anterior = null;

            for (int i = 0; i < posicao; i++) {
                anterior = aux;
                aux = aux.proximo;
            }

            anterior.proximo = novoNo;
            novoNo.proximo = aux;

            if (novoNo.proximo == null) { // Inserção no fim
                fim = novoNo;
            }
        }

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

        No aux = topo;
        No anterior = null;

        for (int i = 0; i < posicao; i++) {
            anterior = aux;
            aux = aux.proximo;
        }

        int retorno = aux.item;

        if (anterior == null) {
            topo = topo.proximo;
            if (topo == null) {
                fim = null;
            }
        } else {
            anterior.proximo = aux.proximo;
            if (anterior.proximo == null) {
                fim = anterior;
            }
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

        No aux = topo;

        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }

        return aux.item;
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
        int posicao = 0;
        No aux = topo;

        while (aux != null) {
            if (aux.item == item) {
                return posicao;
            }
            aux = aux.proximo;
            posicao++;
        }

        return -1;
    }

}
