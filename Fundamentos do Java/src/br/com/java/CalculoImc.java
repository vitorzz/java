package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis num�ricas de precis�o
		// float e double s�o tipos primitivos num�ricos reais (casas decimais)
		double peso,altura,imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("=========== C�lculo do Imc ===========");
        System.out.println("Digite o seu peso em kg: ");
        //entrada
        peso = teclado.nextDouble();
        System.out.println("Digite a sua altura em metros: ");
        altura = teclado.nextDouble();
        //processamento
        imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        if (imc > 15 && imc < 16.9) {
        	System.out.println("Muito abaixo do peso");
			} else if (imc > 16.9 && imc < 18.4) {
				System.out.println("Abaixo do peso");
			} else if (imc > 18.4 && imc < 24.9) {
				System.out.println("Peso Normal");
			} else if (imc > 24.9 && imc < 29.9) {
				System.out.println("Acima do Peso");
			} else if (imc > 29.9 && imc < 34.9) {
				System.out.println("Obesidade Grau 1");
			} else if (imc > 34.9 && imc < 40) {
				System.out.println("Obesidade Grau 2");
			} else if (imc < 16) {
				System.out.println("Extremamente Abaixo do peso, Muito grave");
			} else {
				System.out.println("Obesidade Grau 3");

		}		
	}

}
