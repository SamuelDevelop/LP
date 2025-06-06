package br.cefetmg.inf.lista01.p1010;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int codigoPecaUm = sc.nextInt();
	    int numeroPecasUm = sc.nextInt();
	    float valorPecaUm = sc.nextFloat();
	    
	    int codigoPecaDois = sc.nextInt();
	    int numeroPecasDois = sc.nextInt();
	    float valorPecaDois = sc.nextFloat();
	    
	    
	    double valorTotal = numeroPecasUm*valorPecaUm + numeroPecasDois*valorPecaDois;
	    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	}
}
