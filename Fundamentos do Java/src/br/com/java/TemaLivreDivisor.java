package br.com.java;

import java.util.Scanner;

public class TemaLivreDivisor {

	public static void main(String[] args) {
		double valor1,valor2,resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Divisor");
		System.out.println("");
		//entrada
		System.out.print("Digite o primeiro n�mero: ");
		valor1 = teclado.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		valor2 = teclado.nextDouble();
		//processamento
	    resultado = (valor1 / valor2);
	    //saida
	    System.out.print("Resultado: " + resultado);
	}

}
