package br.com.java; 

import java.util.Scanner;

public class CalcularDesconto {

	public static void main(String[] args) {
		double pre�o,desconto,valorRecebido,totalDesconto,troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		//entrada
		System.out.print("Pre�o do Produto = ");
		pre�o = teclado.nextDouble();
		System.out.print("% de Desconto = ");
		desconto = teclado.nextDouble();
		//processamento
		troco = (pre�o * desconto) / 100;
		totalDesconto = (pre�o - troco);
		//saida
		System.out.println("Total com Desconto "  + totalDesconto);
		System.out.print("Valor Recebido = ");
		//processamento
		valorRecebido = teclado.nextDouble();
		valorRecebido = (valorRecebido - totalDesconto );
		System.out.println("Valor do Troco = " + valorRecebido);
		
	}

}
