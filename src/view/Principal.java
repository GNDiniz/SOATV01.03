package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController oc = new OperacoesController ();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor (limite de entrada 100): "));
		while (tamanho <=0) {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Você precisa informar tamanho do vetor maior que zero: "));
		}
		while (tamanho > 100) {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Você precisa informar tamanho do vetor menor que 100: "));
		}
		oc.numInteiros(tamanho);
	}
}
