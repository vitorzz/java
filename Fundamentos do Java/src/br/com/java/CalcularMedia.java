package br.com.java;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis do tipo real
		float nota1, nota2, media;
		// entrada
		System.out.print("Digite a nota1: ");
		// a linha abaixo cria um objeto de nome teclado usando Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar o que foi
		//digitado no console e armazenar na vari�vel notal1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1+ nota2) /2;
		// sa�da
		// + contatena(junta) um texto com o conte�do da vari�vel m�dia
		System.out.println("M�dia final: " + media);

	}

}


