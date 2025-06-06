package br.cefetmg.inf.lista01.p1052;

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
