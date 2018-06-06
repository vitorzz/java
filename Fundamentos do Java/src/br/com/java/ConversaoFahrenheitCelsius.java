package br.com.java;

import java.util.Scanner;

public class ConversaoFahrenheitCelsius {

	public static void main(String[] args) {
		double fah,conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Converter Fahrenheit para Celsius");
		//entrada
		System.out.print("Digite o valor em Fahrenheit: ");
		fah = teclado.nextDouble();
		//processamento
		fah = (fah - 32);
		conversao = (fah / 1.8);
		//saida
		System.out.println(conversao + "°C ");
		

	}

}
