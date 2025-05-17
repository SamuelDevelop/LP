/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefetmg.lista01.P7;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		float salarioHora = sc.nextFloat();

		float salarioTotal = horas * salarioHora;
		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n", salarioTotal);
	}
}
