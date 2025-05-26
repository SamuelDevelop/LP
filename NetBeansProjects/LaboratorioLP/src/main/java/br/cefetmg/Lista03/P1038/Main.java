/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.Lista03.P1038;

/**
 *
 * @author smuu
 */
import java.util.Scanner;

class Lanche{
    int codigo;
    String especificacao;
    double preco;
    
    public void setLanche(int c, String e, double p){
        codigo = c;
        especificacao = e;
        preco = p;
    }
}

class Cardapio{
    Lanche listaLanches[] = new Lanche[5];
    
    public void gravarLanches(){
        for(int i=0; i<5; i++){
            listaLanches[i] = new Lanche();
        }
        listaLanches[0].setLanche(1, "Cachorro Quente", 4.0);
        listaLanches[1].setLanche(2, "X-salasa", 4.5);
        listaLanches[2].setLanche(3, "X-Bacon", 5.0);
        listaLanches[3].setLanche(4, "Torrada simples", 2.0);
        listaLanches[4].setLanche(5, "Refri", 1.5);
    }
}

class Pedido{
    int codigoPedido;
    int quantidade;
    
    void fazerPedido(){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int q = sc.nextInt();
        
        codigoPedido = c;
        quantidade = q;
    }
}

class CalculoTotal{
    double total;

    void calcularTotal(Pedido pedido, Cardapio cardapio){
        for(int i=0; i<5; i++){
            if(pedido.codigoPedido == cardapio.listaLanches[i].codigo){
                total = pedido.quantidade * cardapio.listaLanches[i].preco;
                System.out.printf("Total: R$ %.2f\n", total);
                return;
            }
        }
    }
}

public class Main{
	public static void main(String[] args) {
		Cardapio novoCardapio = new Cardapio();
		novoCardapio.gravarLanches();
		
		Pedido novoPedido = new Pedido();
		novoPedido.fazerPedido();
        CalculoTotal novoTotal = new CalculoTotal();
        novoTotal.calcularTotal(novoPedido, novoCardapio);
	}
}
