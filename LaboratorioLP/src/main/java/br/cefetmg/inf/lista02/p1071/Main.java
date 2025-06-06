package br.cefetmg.inf.lista02.p1071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int x = leitor.nextInt();
	    int y = leitor.nextInt();
	    int menor = x;
	    int maior = y;
	    int soma = 0;
	    
	    if(y < x){
	        menor = y;
	        maior = x;
	    }
	    
	    for(int i = menor + 1; i < maior; i++){
	        if(i%2 != 0){
	            soma += i;
	        }
	    }
		System.out.println(soma);
	}
}
