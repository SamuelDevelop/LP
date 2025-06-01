/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista02.P1071;

/**
 *
 * @author smuu
 */
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
