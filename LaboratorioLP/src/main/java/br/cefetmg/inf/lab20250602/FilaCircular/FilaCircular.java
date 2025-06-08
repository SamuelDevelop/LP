package br.cefetmg.inf.lab20250602.FilaCircular;

public class FilaCircular {
    int topo;
    int ultimo;
    int capacidade = 10;
    int[] vetor = new int[capacidade];

    FilaCircular() {
        topo = 0;
        ultimo = 0;
    }

    boolean estaVazia() {
        return topo == ultimo;
    }

    boolean estaCheia() {
        return (ultimo + 1) % capacidade == topo;
    }

    int tamanhoFila() {
        if (ultimo >= topo) {
            return ultimo - topo;
        } else {
            return capacidade - topo + ultimo;
        }
    }

    void inserirItem(int item) {
        if (estaCheia()) {
            return;
        }
        vetor[ultimo] = item;
        ultimo = (ultimo + 1) % capacidade;
    }

    Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        int item = vetor[topo];
        topo = (topo + 1) % capacidade;
        return item;
    }
}
