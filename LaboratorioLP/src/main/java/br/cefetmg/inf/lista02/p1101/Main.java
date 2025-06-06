
package br.cefetmg.inf.lista02.p1101;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    int m, n, soma;
	    Scanner leitura = new Scanner(System.in);
	    
	    do{
    		m = leitura.nextInt();
    		n = leitura.nextInt();
    		
    		if(m <= 0 || n <= 0){
    		    break;
    		}
    		
    		int maior = m;
    		int menor = n;
    		soma = 0;
    
    		if(m < n){
    		    maior = n;
    		    menor = m;
    		}
    		for(int i=menor; i <= maior; i++){
    		    System.out.printf("%d ", i);
    		    soma += i;
    		}
    		System.out.printf("Sum=%d\n", soma);
	    } while(n > 0 || m > 0);
		
	}
}
