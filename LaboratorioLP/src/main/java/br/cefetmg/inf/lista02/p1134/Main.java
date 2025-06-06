
package br.cefetmg.inf.lista02.p1134;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner leitura = new Scanner(System.in);
	    int n = leitura.nextInt();
        int alcool = 0, gasolina = 0, disel = 0;
        
	    while(n != 4){
	            if(n == 1){
	                alcool ++;
	            }
	            if(n == 2){
	                gasolina ++;
	            }
	            if(n == 3){
	                disel ++;
	            }
	        n = leitura.nextInt();
	    }
	    System.out.println("MUITO OBRIGADO");
	    System.out.println("Alcool: "+ alcool);
	    System.out.println("Gasolina: "+ gasolina);
	    System.out.println("Diesel: "+ disel);
	}
}
