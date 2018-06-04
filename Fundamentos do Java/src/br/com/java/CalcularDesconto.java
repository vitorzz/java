package br.com.java; 

import java.util.Scanner;

public class CalcularDesconto {

	public static void main(String[] args) {
		double preço,desconto,valorRecebido,totalDesconto,troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		//entrada
		System.out.print("Preço do Produto = ");
		preço = teclado.nextDouble();
		System.out.print("% de Desconto = ");
		desconto = teclado.nextDouble();
		//processamento
		troco = (preço * desconto) / 100;
		totalDesconto = (preço - troco);
		//saida
		System.out.println("Total com Desconto "  + totalDesconto);
		System.out.print("Valor Recebido = ");
		//processamento
		valorRecebido = teclado.nextDouble();
		valorRecebido = (valorRecebido - totalDesconto );
		System.out.println("Valor do Troco = " + valorRecebido);
		
	}

}
