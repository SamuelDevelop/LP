package br.cefetmg.inf.lista01.p1038;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int codigo = sc.nextInt();
	    int quantidade = sc.nextInt();
	    double totalPagar = 0;
	    
	    if(codigo == 1){
	        totalPagar = 4* quantidade;
	    }
	    else if(codigo == 2){
	        totalPagar = 4.5* quantidade;
	    }
	    else if(codigo == 3){
	        totalPagar = 5* quantidade;
	    }
	    else if(codigo == 4){
	        totalPagar = 2* quantidade;
	    }
	    else if(codigo == 5){
	        totalPagar = 1.5* quantidade;
	    }
        
        System.out.printf("Total: R$ %.2f\n", totalPagar);
	}
}
