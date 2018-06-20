package br.com.java;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "São Paulo";
		System.out.println("__Fundamentos do array__");
		System.out.println("__________________________");
		System.out.println("Exemplo 1: Sem array");
		System.out.println("Time: " + time3);
		//a linha abaixo cria um valor simples
		String[] times = {"Corinthians" , "Palmeiras" , "Santos" , "São Paulo"};
		System.out.println("Exemplo 2: Com array");
		//a linha abaixo recupera o conteúdo do indice [0] do array
		System.out.println("Time: " + times [2] );
		//a linha abaixo recupera o conteúdo do indice [2] do array
		times[2] = "Flamengo" ;
		System.out.println("Exemplo 3: modificando um array");		
		System.out.println("Time: " + times [2] );
		// obtendo o tamanho total do array
		System.out.println("Total de times: " + times.length);
		
	}
	
}