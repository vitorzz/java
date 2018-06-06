package br.com.java;

import java.util.Scanner;

public class VerificarMaioridade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
        //processamento
		if (idade <18) {
        	System.out.println("Menor de Idade");
        } else {
        	System.out.println("Maior de Idade");
        }
	}

}
