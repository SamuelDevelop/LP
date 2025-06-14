
package br.cefetmg.inf.lab20250609;
class No {
    int item;
    No proximo;
    No anterior;

    No(int item) {
        this.item = item;
        this.proximo = null;
        this.anterior = null;
    }
}

public class ListaDuplamenteEncadeada {
    int qntElementos;
    No topo;
    No fim;

    ListaDuplamenteEncadeada() {
        qntElementos = 0;
        topo = null;
        fim = null;
    }

    void inserirInicio(int valor) {
        inserirMeio(0, valor);
    }

    void inserirMeio(int posicao, int valor) {
        if (posicao < 0 || posicao > qntElementos) {
            return;
        }

        No novoNo = new No(valor);

        if (estaVazia()) {
            topo = novoNo;
            fim = novoNo;
        } else if (posicao == 0) {
            novoNo.proximo = topo;
            topo.anterior = novoNo;
            topo = novoNo;
        } else if (posicao == qntElementos) {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        } else {
            No aux = topo;

            for (int i = 0; i < posicao; i++) {
                aux = aux.proximo;
            }

            novoNo.proximo = aux;
            novoNo.anterior = aux.anterior;
            aux.anterior.proximo = novoNo;
            aux.anterior = novoNo;
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

        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }

        int retorno = aux.item;

        if (aux == topo && aux == fim) {
            topo = null;
            fim = null;
        } else if (aux == topo) {
            topo = topo.proximo;
            topo.anterior = null;
        } else if (aux == fim) {
            fim = fim.anterior;
            fim.proximo = null;
        } else {
            aux.anterior.proximo = aux.proximo;
            aux.proximo.anterior = aux.anterior;
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

    void imprimirLista() {
        No aux = topo;
        while (aux != null) {
            System.out.print(aux.item + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    void imprimirReverso() {
        No aux = fim;
        while (aux != null) {
            System.out.print(aux.item + " ");
            aux = aux.anterior;
        }
        System.out.println();
    }
}

