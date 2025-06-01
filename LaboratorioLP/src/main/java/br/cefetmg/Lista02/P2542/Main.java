/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista02.P2542;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        while (leitura.hasNext()) {
            int n = leitura.nextInt();
            int m = leitura.nextInt();
            int l = leitura.nextInt();

            int[][] cartasMarcos = new int[m][n];
            int[][] cartasLeonardo = new int[l][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    cartasMarcos[i][j] = leitura.nextInt();
                }
            }

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < n; j++) {
                    cartasLeonardo[i][j] = leitura.nextInt();
                }
            }

            int escolhaMarcos = leitura.nextInt() - 1;
            int escolhaLeonardo = leitura.nextInt() - 1;
            int atributo = leitura.nextInt() - 1;

            int valorMarcos = cartasMarcos[escolhaMarcos][atributo];
            int valorLeonardo = cartasLeonardo[escolhaLeonardo][atributo];

            if (valorMarcos > valorLeonardo) {
                System.out.println("Marcos");
            } else if (valorLeonardo > valorMarcos) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
