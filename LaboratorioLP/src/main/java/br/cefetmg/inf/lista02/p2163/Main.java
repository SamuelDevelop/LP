/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2163;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] matriz = new int[n][m];
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < m; j++){
	            matriz[i][j] = sc.nextInt();
	        }
	    }

	    int[] deslocamentoX = {-1, -1, -1, 0, 0, 1, 1, 1};
	    int[] deslocamentoY = {-1, 0, 1, -1, 1, -1, 0, 1};

	    for(int i = 1; i < n - 1; i++){
	        for(int j = 1; j < m - 1; j++){
	            if(matriz[i][j] == 42){
	                boolean todosSete = true;

	                for(int k = 0; k < 8; k++){
	                    int x = i + deslocamentoX[k];
	                    int y = j + deslocamentoY[k];

	                    if(matriz[x][y] != 7){
	                        todosSete = false;
	                        break;
	                    }
	                }

	                if(todosSete){
	                    System.out.println((i+1) + " " + (j+1));
	                    return;
	                }
	            }
	        }
	    }

	    System.out.println("0 0");
	}
}
