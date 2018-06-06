package br.com.java;

import java.util.Scanner;

public class VerificaObrigatoriedadedeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verifica Obrigatoriedade de Votar");
		//entrada
		System.out.print("Digite sua Idade: ");
		idade = teclado.nextInt();
		if (idade < 16) {
			System.out.println("Proibido Votar"); 
		} else if (idade == 16 || idade == 17 || idade > 70){	
			System.out.println("Voto Facultativo"); 
		} else {
			System.out.println("Voto Obrigatório");
		}
    }
		
		

	}


