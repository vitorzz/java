package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
	    double gasolina,alcool;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		//processamento
		alcool = (alcool / gasolina);
		if (alcool <0.7) {
			System.out.println("Vantagem usar Alcool ");
		} else {
			System.out.println("Vantagem usar gasolina ");
			
		}

	}

}
