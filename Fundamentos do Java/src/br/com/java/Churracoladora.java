/*
 * Atividade de avaliação - Churrascoladora
 * @author Vitor Zelli, Bruno, Gustavo Orlando
 */

package br.com.java;

import java.util.Scanner;

public class Churracoladora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//variavéis
		int homem, mulher, criança;
		double khomem = 0.3;
		double chomem = 12;
		double kmulher = 0.3;
		double cmulher = 4;
		double rmulher = 2;
		double kcriança = 0.1;
		double rcriança = 2;
		double carne = 50;
		int cerveja = 2;
		int refri = 2;
		double carvao = 0.5;
		double tcarne;
		double pcarne;
		double tcerveja;
		double pcerveja;
		double trefri;
		double prefri;
		double tcarvao;
		double pcarvao = 8;
		double rscarvao;	
		double total;
		double valorpessoa;
		//entrada
		System.out.println("CHURRASCOLADORA");
		System.out.println("");
		System.out.println("Quantidade de homens: ");
		homem = teclado.nextInt();
		System.out.println("Quantidade de mulheres: ");
		mulher = teclado.nextInt();
		System.out.println("Quantidade de crianças: ");
		criança = teclado.nextInt();
		System.out.println("Preço médio do Kg da carne: ");
		carne = teclado.nextDouble();
		System.out.println("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextInt();
		System.out.println("Preço médio da lata de refri: ");
		refri = teclado.nextInt();
		System.out.println("Preço médio do saco de carvão: ");
		//processamento
		tcarne = (homem * khomem) + (mulher * kmulher) + (criança * kcriança);
		pcarne = (tcarne * carne);
		tcerveja = (homem * chomem) + (mulher * cmulher);
		pcerveja = (tcerveja * cerveja);
		trefri = (mulher * rmulher) + (criança * rcriança);
		prefri = (trefri * refri);
		tcarvao = (tcarne * carvao);
		rscarvao = (pcarvao * tcarvao);
		total = (pcarne + pcerveja + prefri + rscarvao);
		valorpessoa = (total / 20);
		//saida
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Lista de compras");
		//exibir quantidade e preço
		System.out.println("Quantidade total de carne: " + tcarne + "kg R$" + pcarne);
		System.out.println("Quantidade total de cerveja: " + tcerveja + " Latas R$" + pcerveja);
		System.out.println("Quantidade total de refri: " + trefri + " Latas R$" + prefri);
		System.out.println("Quantidade total de carvão: " + tcarvao + " kg R$" + rscarvao);
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Valor total do churras: R$" + total);
		System.out.println("Valor por pessoa: R$" + valorpessoa);
		
		
	}

}
