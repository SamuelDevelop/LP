package br.cefetmg.inf.lista01.p1008;

import java.io.IOException;
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
