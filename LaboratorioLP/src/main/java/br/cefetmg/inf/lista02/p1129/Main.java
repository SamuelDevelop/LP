package br.cefetmg.inf.lista02.p1129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner leitura = new Scanner(System.in);
	    int n = leitura.nextInt();

	    while(n != 0){
	        for(int i = 0; i < n; i++){
	            int a = leitura.nextInt();
    	        int b = leitura.nextInt();
    	        int c = leitura.nextInt();
    	        int d = leitura.nextInt();
    	        int e = leitura.nextInt();
    	        int marcadas = 0;
    	        char resposta = '*';
    	        
    	        if(a <= 127){
    	           marcadas ++;
    	           resposta = 'A';
    	        }
    	        
    	        if(b <= 127){
    	           marcadas ++;
    	           resposta = 'B';
    	       }
    	       if(c <= 127){
    	           marcadas ++;
    	           resposta = 'C';
    	       }
    	       if(d <= 127){
    	           marcadas ++; 
    	           resposta = 'D';
    	       }
    	       if(e <= 127){
    	           marcadas ++;
    	           resposta = 'E';
    	       }
    	       
    	       if(marcadas != 1){
	                resposta = '*';
	            }
    	       System.out.println(resposta);
	        }
	        n = leitura.nextInt();
	    }
	}
}
