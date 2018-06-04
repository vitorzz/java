package br.com.java;

import java.util.Scanner;

public class ConversaoDolarReal {

	public static void main(String[] args) {
		double dolar,real,conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Converter Dolar em Real");
		//entrada
		real = (3.76);
		System.out.print("Digite o valor em Dolar: ");
		dolar = teclado.nextDouble();
		//processamento
		conversao = real * dolar;
		//saida
		System.out.print("Valor em Reais: " + conversao);
		
		
		

	}

}
