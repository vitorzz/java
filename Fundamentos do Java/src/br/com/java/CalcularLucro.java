package br.com.java;

import java.util.Scanner;

public class CalcularLucro {

	public static void main(String[] args) {
		double custo,venda,lucro;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Lucro Adquirido");
		//entrada
		System.out.print("Pre�o de Custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		//processamento
		venda = custo + ((custo * lucro) / 100);
		//sa�da
		System.out.println("Pre�o de venda: " + venda);
		
		
		
		
		
		
		

	}

}
