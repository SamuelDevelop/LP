package br.cefetmg.inf.lista02.p1245;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] numerosEsquerda = new int[61];
            int[] numerosDireita = new int[61];

            for (int i = 0; i < n; i++) {
                int numero = sc.nextInt();
                char ladoPe = sc.next().charAt(0);
                if (ladoPe == 'E') {
                    numerosEsquerda[numero]++;
                } else if (ladoPe == 'D') {
                    numerosDireita[numero]++;
                }
            }

            int totalPares = 0;
            for (int i = 30; i <= 60; i++) {
                if (numerosEsquerda[i] < numerosDireita[i]) {
                    totalPares += numerosEsquerda[i];
                } else {
                    totalPares += numerosDireita[i];
                }
            }

            System.out.println(totalPares);
        }
    }
}
