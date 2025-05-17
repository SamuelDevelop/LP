/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefetmg.lista01.P9;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    if(b>c && d>a && c+d > a+b && c>= 0 && d>= 0 && a%2 == 0){
	        System.out.printf("Valores aceitos\n");
	    }
	    else{
	        System.out.printf("Valores nao aceitos\n");
	    }


	}
}
