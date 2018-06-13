package br.com.java;

import java.util.Scanner;

public class CalculoValorServico {

	public static void main(String[] args) {
		double remuneracao,cargaHoraria,custo,imposto,investimento,total,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo do Serviço");
		System.out.println("");	
		System.out.print("Valor da Remuneração: ");
		remuneracao = teclado.nextDouble();
		imposto = ((remuneracao / 100) * 30);
	    System.out.print("Valor do Custo Operacional: ");
	    custo = teclado.nextDouble();
	    investimento = ((remuneracao / 100) * 20);
	    total = (remuneracao + imposto + custo + investimento);
	    System.out.print("Digite a Carga Horária: ");
	    cargaHoraria = teclado.nextDouble();
	    valor = (total / cargaHoraria);
	    System.out.println("Valor da Hora: " + valor);
	    
	    
	    
	    

	}

}
