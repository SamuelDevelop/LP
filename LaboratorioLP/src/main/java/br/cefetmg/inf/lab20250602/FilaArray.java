package br.cefetmg.inf.lab20250602;
import java.util.Scanner;

public class FilaArray {
   int topo;
   int ultimo;
   int[] vetorDinamico = new int[10];
   
   void inicializarFila(){
       topo = 0;
       ultimo = 0;
   }
   boolean estaVazia(){
       return topo == 0 && ultimo == 0;
   }
      
   boolean estaCheia(){
       return ultimo == vetorDinamico.length - 1;
   }
   
   int tamanhoFila(){
       return ultimo;
   }
   
   void inserirItem(int item){
       if(estaCheia()){
           ampliarFila(); 
       }
       vetorDinamico[ultimo] = item;
       ultimo ++;
   }
   
   int desenfileirar(){
       if(estaVazia()){
           return -1; //deveria retornar erro mas como é int assumi -1 como erro
       }
       else{
           int retorno = vetorDinamico[topo];
           int tamanho = tamanhoFila();
           for(int i = topo; i < tamanho - 1; i++){
               vetorDinamico[i] = vetorDinamico[i+1];
           }           
           return retorno;
       }
   }
   
    private void ampliarFila(){
       int[] novoVetor = new int[vetorDinamico.length + 10];
       int tamanho = tamanhoFila();
       for(int i = topo; i < tamanho; i++){
               novoVetor[i] = vetorDinamico[i];
       }
       
       vetorDinamico = novoVetor;
   }
}
