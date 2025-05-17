/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefetmg.lista01.P4;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double media = ((a*3.5) + (b*7.5)) / 11;
		System.out.printf("MEDIA = %.5f%n", media);

	}
}
