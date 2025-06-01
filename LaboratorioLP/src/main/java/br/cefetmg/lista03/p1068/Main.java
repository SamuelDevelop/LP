/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.lista03.p1068;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

class No {
    private String valor;
    private No prox;

    void setNoValor(String valor) {
        if (valor != null && valor.length() == 1) {
            this.valor = valor;
        }
    }

    void setNoProx(No prox) {
        this.prox = prox;
    }

    String getNoValor() {
        return this.valor;
    }

    No getNoProx() {
        return this.prox;
    }
}

class Pilha {
    private No topo;

    void empilhar(String valor) {
        if (valor == null || valor.length() != 1) {
            return;
        }

        No novo = new No();
        novo.setNoValor(valor);
        novo.setNoProx(topo);
        topo = novo;
    }

    String desempilhar() {
        if (topo == null) {
            return null;
        }

        String valor = topo.getNoValor();
        topo = topo.getNoProx();
        return valor;
    }
    
    int tamanhoPilha() {
        int contador = 0;
        No atual = topo;
        while (atual != null) {
            contador++;
            atual = atual.getNoProx();
        }
        return contador;
    }
}

class Expressao {
    String caracteres;
    Pilha p = new Pilha();

    Expressao(String expr) {
        this.caracteres = expr;
    }

    void verificarExpressaoCorreta() {
        for (int i = 0; i < caracteres.length(); i++) {
            char caracter = caracteres.charAt(i);

            if (caracter == '(') {
                p.empilhar(String.valueOf(caracter));
            }

            if (caracter == ')') {
                if (p.desempilhar() == null) {
                    System.out.println("incorrect");
                    return;
                }
            }
        }

        if (p.tamanhoPilha() == 0) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            if (linha.isEmpty()) break;
            Expressao exp = new Expressao(linha);
            exp.verificarExpressaoCorreta();
        }
        sc.close();
    }
}