package br.cefetmg.inf.lab20250512.p1105;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        while (true) {
            int b = leitura.nextInt();
            int n = leitura.nextInt();

            if (b == 0 && n == 0) break;

            int[] reservas = new int[b + 1];

            for (int i = 1; i <= b; i++) {
                reservas[i] = leitura.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int d = leitura.nextInt();
                int c = leitura.nextInt();
                int v = leitura.nextInt();

                reservas[d] -= v;
                reservas[c] += v;
            }

            boolean possivel = true;
            for (int i = 1; i <= b; i++) {
                if (reservas[i] < 0) {
                    possivel = false;
                    break;
                }
            }

            System.out.println(possivel ? "S" : "N");
        }

    }
}
