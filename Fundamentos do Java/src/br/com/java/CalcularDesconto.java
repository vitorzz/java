package br.com.java; 

import java.util.Scanner;

public class CalcularDesconto {

	public static void main(String[] args) {
		double pre�o,desconto,total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		System.out.println("desconto % de pre�o = total");
		//entrada
		System.out.print("Digite o pre�o = ");
		pre�o = teclado.nextDouble();
		System.out.println("Digite o Desconto% = ");
		desconto = teclado.nextDouble();
		//processamento
		total = (pre�o * desconto) / 100;
		//saida
		System.out.println(pre�o + "% de " + desconto + " = " + total);
		
		

	}

}
