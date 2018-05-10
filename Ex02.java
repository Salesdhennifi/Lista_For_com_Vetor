import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene 7 idades, armazenar em um vetor,
		 * solicitando ao usuário e ao final apresentar as idades ao usuário.
		 */

		int[] idades = new int[7];

		for (int i = 0; i < idades.length; i++) { //solicitar idade para o usuario
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a Idade do usuario: "));
		}
		for (int i = 0; i < idades.length; i++) { //apresentar na tela
			JOptionPane.showMessageDialog(null, "Idades dos usuarios: " + idades[i]);
		}

	}

}