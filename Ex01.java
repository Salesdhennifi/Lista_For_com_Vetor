import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene 25 nomes, para tal utilize um
		 * vetor com 25 posições e o comando for​ para armazenar os valores.
		 * Observação: para armazenar os valores deve-se solicitar os nomes ao
		 * usuário.
		 */

		Scanner teclado = new Scanner(System.in);

		String[] nomes = new String[25];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog(null, "Insira o nome: ");
		}

		for (int i = 0; i < nomes.length; i++) {
			JOptionPane.showMessageDialog(null, "nomes: " + nomes[i]);

		}
	}
}