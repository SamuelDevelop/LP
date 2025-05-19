/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista01.P1042;

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
	    
	    if(a>=b && a>=c && b>=c){
	        System.out.printf("%d\n%d\n%d\n", c, b, a);
	    }
	    else if(a>b && a>=c && c>b){
	        System.out.printf("%d\n%d\n%d\n", b, c, a);
	    }
	    else if(b>=a && b>c && a>c){
	        System.out.printf("%d\n%d\n%d\n", c, a, b);
	    }
	    else if(b>=c && b>a && c>a){
	        System.out.printf("%d\n%d\n%d\n", a, c, b);
	    }
	    else if(c>=a && c>b && a>b){
	        System.out.printf("%d\n%d\n%d\n", b, a, c);
	    }
	    else if(c>=b && c>a && b>a){
	        System.out.printf("%d\n%d\n%d\n", a, b, c);
	    }

        
        System.out.printf("\n%d\n%d\n%d\n", a, b, c);

	}
}
