/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2060;

/**
 *
 * @author smuu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] vetor = new int[n];
	    int multDois = 0;
	    int multTres = 0;
	    int multQuatro = 0;
	    int multCinco = 0;
	    
	    for(int i=0; i<n; i++){
	        vetor[i] = sc.nextInt();
	        if(vetor[i]%2 == 0){
	            multDois ++;
	        }
	        if(vetor[i]%3 == 0){
	            multTres ++;
	        }
	        if(vetor[i]%4 == 0){
	            multQuatro ++;
	        }
	        if(vetor[i]%5 == 0){
	            multCinco ++;
	        }
	    }
	    
	    System.out.println(multDois + " Multiplo(s) de 2");
		System.out.println(multTres + " Multiplo(s) de 3");
		System.out.println(multQuatro + " Multiplo(s) de 4");
		System.out.println(multCinco + " Multiplo(s) de 5");
		
	}
}
