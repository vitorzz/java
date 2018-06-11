package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		int jogar;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("JokenPo");
	    System.out.println("");
	    //entrada
	    System.out.print("1 para Pedra, 2 para Papel ou 3 para Tesoura");
	    System.out.println("");
	    System.out.println("Digite a opção desejada: ");
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
	    Random computador = new Random();
	    int opcao = computador.nextInt(3) + 1;
	    switch (opcao) {
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
        if ((jogar ==1 && opcao ==3) || (jogar ==2 && opcao ==1 ) || (jogar ==3 && opcao ==2)) {
        	System.out.println("Você Venceu!!!"); 
			
		} else if ((jogar ==1 && opcao ==2) || (jogar ==2 && opcao ==3 ) || (jogar ==3 && opcao ==1)) {
			System.out.println("Computador Venceu!!!");
		
		} else {
			System.out.println("Empate!!!");
			

		}
        
}
}