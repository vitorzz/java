package br.com.java;

import java.util.Scanner;

public class OperadorAritimetico {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritiméticos");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.print("Digite o valor y: ");
		y = teclado.nextFloat();
		// Soma
        System.out.println("x + y =" + (x + y));
        // Subtração
        System.out.println("x - y = " + (x - y));
        // Divisão
        System.out.println("x / y = " + (x / y));
        // Multiplição
        System.out.println("x * y = " + (x * y));
        // Módulo
        System.out.println("x % y = " + (x % y));
        // Incremento x++ (equivale a x = x + 1)
        x++;
        System.out.println("x++ " + x);
        y--;
        // Decremento x-- (equivale a x = x - 1)
        System.out.println("y-- " + y);
		
	

	}

}
