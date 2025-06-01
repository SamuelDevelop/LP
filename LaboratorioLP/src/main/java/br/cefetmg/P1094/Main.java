/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.P1094;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
		Scanner leitura = new Scanner(System.in);
		int numeroDeTestes = leitura.nextInt(); 
		
		char[] animais = new char[numeroDeTestes];
		int[] testesComAnimal = new int[numeroDeTestes];
		
		for(int i=0; i < numeroDeTestes; i++){
		    testesComAnimal[i] = leitura.nextInt();
		    animais[i] = leitura.next().charAt(0);
		}
		
		//calcular total;
		double totalTestes = 0;
		for(int i=0; i < numeroDeTestes; i++){
		    totalTestes += testesComAnimal[i];
		}
		
		//total por Animal
		int totalCoelhos = 0;
		int totalSapos = 0;
		int totalRatos = 0;
		for(int i=0; i < numeroDeTestes; i++){
		    if(animais[i] == 'C'){
		        totalCoelhos += testesComAnimal[i];
		    }
		    else if(animais[i] == 'S'){
		        totalSapos += testesComAnimal[i];
		    }
		    else if(animais[i] == 'R'){
		        totalRatos += testesComAnimal[i];
		    }
		}
		
		System.out.printf("Total: %.0f cobaias\n", totalTestes);
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		
		
		double percentualCoelhos = (totalCoelhos/totalTestes) * 100;
		double percentualRatos = (totalRatos/totalTestes) * 100;
		double percentualSapos = (totalSapos/totalTestes) * 100;
		
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
	}
}
