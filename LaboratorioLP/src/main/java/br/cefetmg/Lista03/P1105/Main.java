/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista03.P1105;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

class Banco {
    int saldo;

    void adicionar(int valor) {
        saldo += valor;
    }

    void subtrair(int valor) {
        saldo -= valor;
    }

    int getSaldo() {
        return saldo;
    }

    void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

class Transacao {
    Banco devedor;
    Banco credor;
    int valor;

    void setDevedor(Banco devedor) {
        this.devedor = devedor;
    }

    void setCredor(Banco credor) {
        this.credor = credor;
    }

    void setValor(int valor) {
        this.valor = valor;
    }

    void processar() {
        devedor.subtrair(valor);
        credor.adicionar(valor);
    }
}

class SistemaFinanceiro {
    Banco[] bancos;

    void setBancos(int quantidade) {
        bancos = new Banco[quantidade];
        for (int i = 0; i < quantidade; i++) {
            bancos[i] = new Banco();
        }
    }

    Banco getBanco(int indice) {
        return bancos[indice];
    }

    void aplicarTransacao(Transacao t) {
        t.processar();
    }

    boolean todosSolventes() {
        for (Banco b : bancos) {
            if (b.getSaldo() < 0) {
                return false;
            }
        }
        return true;
    }
}

class Controlador {
    void executar() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (b == 0 && n == 0) break;

            SistemaFinanceiro sistema = new SistemaFinanceiro();
            sistema.setBancos(b);

            for (int i = 0; i < b; i++) {
                int saldo = sc.nextInt();
                sistema.getBanco(i).setSaldo(saldo);
            }

            for (int i = 0; i < n; i++) {
                int d = sc.nextInt() - 1;
                int c = sc.nextInt() - 1;
                int v = sc.nextInt();

                Transacao t = new Transacao();
                t.setDevedor(sistema.getBanco(d));
                t.setCredor(sistema.getBanco(c));
                t.setValor(v);
                sistema.aplicarTransacao(t);
            }

            if (sistema.todosSolventes()) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.executar();
    }
}