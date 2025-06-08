package br.cefetmg.inf.lab20250602.FilaEncadeada;

class No{
    int valor;
    No proximo;
    
    No(int valor){
        this.valor = valor;
    }
}

public class FilaEncadeada{
    No topo;
    No ultimo;
    int tamanho;
    
    FilaEncadeada(){
        topo = null;
        ultimo = null;
        tamanho = 0;
    }
    void enfileirar(int item){
        No novoNo = new No(item);
        tamanho ++;
        
        if(estaVazia()){
            topo = novoNo;
            ultimo = novoNo;
        }
        else{
            if(ultimo != null){
                ultimo.proximo = novoNo;
                ultimo = novoNo;
            }
        }
        
    }
    Integer desenfileirar(){
        if(estaVazia()){
            return null;
        }
        else{
            int retorno = topo.valor;
            No aux = topo;
            topo = topo.proximo;
            aux.proximo = null;
            tamanho --;
            
            if (topo == null) {
                ultimo = null;
            }
            return retorno;
        }
    }
    
    boolean estaVazia(){
        return tamanho == 0;
    }
}