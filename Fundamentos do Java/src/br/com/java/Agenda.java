package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		String[][] Agenda = { { "Bill gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvalds", "2222-2222", "linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icioud.com" } };
		// System.out.println("Email do Linus" + Agenda [1][2]);
		// alterando o telefone do Bill Gates
		// Agenda [0][1] = "9999-9999";
		// System.out.println(Agenda [0][1]);
		for (int i = 0; i < Agenda.length; i++) {
			System.out.println("_______________________");
			for (int j = 0; j < Agenda[i].length; j++) {
				System.out.println(Agenda[i][j]);
			}
		}

	}

}
