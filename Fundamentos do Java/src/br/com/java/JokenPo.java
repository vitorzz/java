/**
 * Atividade JokenPo
 * @author Gustavo Orlando / Vitor Zelli / Lucas Soares
 * Date 13/06/2018
 */



package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		int jogar;
		char escolha = 's';
		int player1 = 0;
		int player2 = 0;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("JokenPo");
	    System.out.println("");
	    //entrada
	    System.out.println("1 para Pedra, 2 para Papel ou 3 para Tesoura");
	    System.out.println("");
	    do {
	    System.out.println("PLACAR");
	    System.out.println("");
	    System.out.println("Você " + player1 + " x " + player2 + " Computador");
	    System.out.println("");
	    System.out.print("Digite a opção desejada: ");
	    jogar = teclado.nextInt();
	    //processamento
	    switch (jogar) {
	       case 1:
	    	   System.out.println("Você Escolheu Pedra");
	    	   break;
	       case 2:
	    	   System.out.println("Você Escolheu Papel");
	    	   break;
	       case 3:
	    	   System.out.println("Você Escolheu Tesoura");
	    	   break;
	       default:
	    	   System.out.println("Opção Inválida");
	    	   break;
	    	   
	    	   
	    }
	    Random opcao = new Random();
	    int computador = opcao.nextInt(3) + 1;
	    switch (computador) {
	       case 1:
	    	   System.out.println("Computador Escolheu Pedra");
	    	   break;
	       case 2:
	    	   System.out.println("Computador Escolheu Papel");
	    	   break;
	       case 3:
	    	   System.out.println("Computador Escolheu Tesoura");
	    	   break;
	    	 }
	    
        if ((jogar ==1 && computador ==3) || (jogar ==2 && computador ==1 ) || (jogar ==3 && computador ==2)) {
        	System.out.println("Você Venceu!!!");
        	player1++;
        	
			
		} else if ((jogar ==1 && computador ==2) || (jogar ==2 && computador ==3 ) || (jogar ==3 && computador ==1)) {
			System.out.println("Computador Venceu!!!");
			player2++;
			
			
			} else if ((jogar ==1 && computador ==1) || (jogar ==2 && computador ==2 ) || (jogar ==3 && computador ==3)) {
			System.out.println("Empate!!!");
		
		} else {
			System.out.println("Opção Inválida, Digite 1, 2 ou 3");
			
		}
		
		
	       System.out.println("Deseja jogar novamente? (s/n) ");	
		   escolha = teclado.next().charAt(0);
		} while (escolha == 's');

		

		}
        
}
