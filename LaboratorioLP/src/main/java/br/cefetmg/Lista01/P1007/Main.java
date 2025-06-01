/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista01.P1007;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = (a*b - c*d);
		System.out.printf("DIFERENCA = %d\n", diferenca);
	}
}
