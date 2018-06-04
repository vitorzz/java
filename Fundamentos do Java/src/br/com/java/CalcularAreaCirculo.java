package br.com.java;

import java.util.Scanner;

public class CalcularAreaCirculo {

	public static void main(String[] args) {
		double area,pi,raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular Area do Circulo");
        pi = (3.14);
        System.out.print("Insira o Raio: ");
        raio = teclado.nextDouble();
        area = pi * (raio * raio); 
        System.out.print("Area do Circulo: " + area);
        
        
        
        
        
	}

}
