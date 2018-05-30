package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria variáveis numéricas de precisão
		// float e double são tipos primitivos numéricos reais (casas decimais)
		double peso,altura,imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("=========== Cálculo do Imc ===========");
        System.out.println("Digite o seu peso em kg: ");
        //entrada
        peso = teclado.nextDouble();
        System.out.println("Digite a sua altura em metros: ");
        altura = teclado.nextDouble();
        //processamento
        imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        		
	}

}
