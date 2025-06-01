/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.lista01.p1052;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int mes = sc.nextInt();
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        
        System.out.printf("%s\n", months[mes-1]);

	}
}
