package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1 Windows");
		System.out.println("2 Linux");;
		System.out.println("Digite a op��o desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			windows(); //executar o m�todo
			break;
		case 2:
			linux();
			break;
		default: //caso nenhuma op��o selecionad
			System.out.println("Op��o inv�lida");
			break;
		
		}
	}
    
	//Criando um m�todo
	static void windows() {
		System.out.println("Carregando o Windows......");
	}
	
	static void linux() {
		System.out.println("Carregando o Linux...");
	}
}
