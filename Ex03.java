import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene PREÇOS, deve-se solicitar ao
		 * usuário a QUANTIDADE DE REGISTROS que o mesmo deseja armazenar. Após
		 * isto, solicitar os preços de acordo com a quantidade de registros. Ao
		 * final apresentar todos os preços e o total dos preços.
		 */
		int registros = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Registro para cadastrar: "));
		double[] precos = new double[registros];
		double soma = 0; // variavel para soma dos valores
		for (int i = registros -  1; i >= 0; i-= 1) {
			precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));

			soma += (precos[i]);
		}

		for (int i = registros - 1; i >= 0; i--) {
			JOptionPane.showMessageDialog(null, "Os preços cadastrados R$" + precos[i]);
			
		}
		JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
	}

}