package br.com.java;

import java.util.Scanner;

public class OperadorAritimetico {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritim�ticos");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.print("Digite o valor y: ");
		y = teclado.nextFloat();
		// Soma
        System.out.println("x + y =" + (x + y));
        // Subtra��o
        System.out.println("x - y = " + (x - y));
        // Divis�o
        System.out.println("x / y = " + (x / y));
        // Multipli��o
        System.out.println("x * y = " + (x * y));
        // M�dulo
        System.out.println("x % y = " + (x % y));
        // Incremento x++ (equivale a x = x + 1)
        x++;
        System.out.println("x++ " + x);
        y--;
        // Decremento x-- (equivale a x = x - 1)
        System.out.println("y-- " + y);
		
	

	}

}
