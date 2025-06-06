package br.cefetmg.inf.lista03.p1042;

import java.util.Scanner;

class Lista{
    int[] vetor = new int[3];
    int[] ordemOriginal = new int[3];
    
    void preencherLista(){
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<3; i++){
            int a = sc.nextInt();
            vetor[i] = a;
            ordemOriginal[i] = a;
        }
    }
    
    void exibirLista(int[] vetor){
        for(int i =0; i<3; i++){
            System.out.println(vetor[i]);
        }
    }
    
    void ordenarLista(){
        int n1, n2, n3;
        n1 = vetor[0];
        n2 = vetor[1];
        n3 = vetor[2];
        
         int menor, meio, maior;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                meio = n2;
                maior = n3;
            } else {
                meio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                meio = n1;
                maior = n3;
            } else {
                meio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                meio = n1;
                maior = n2;
            } else {
                meio = n2;
                maior = n1;
            }
        }
        
        vetor[0] = menor;
        vetor[1] = meio;
        vetor[2] = maior;
    }
}

class Operacoes{
    void executarOperacoes(){
        Lista l = new Lista();
		l.preencherLista();
		l.ordenarLista();
		l.exibirLista(l.vetor);
		System.out.println();
		l.exibirLista(l.ordemOriginal);
    }
}
public class Main {
	public static void main(String[] args) {
		Operacoes novaOperacao = new Operacoes();
		novaOperacao.executarOperacoes();
	}
}
