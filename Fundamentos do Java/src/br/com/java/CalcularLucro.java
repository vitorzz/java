package br.com.java;

import java.util.Scanner;

public class CalcularLucro {

	public static void main(String[] args) {
		double custo,venda,lucro;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Lucro Adquirido");
		//entrada
		System.out.print("Preço de Custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		//processamento
		venda = custo + ((custo * lucro) / 100);
		//saída
		System.out.println("Preço de venda: " + venda);
		
		
		
		
		
		
		

	}

}
