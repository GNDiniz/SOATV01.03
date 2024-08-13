package controller;

import javax.swing.JOptionPane;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void numInteiros(int tamanho) {
		int[] vetorNum = new int [tamanho];
		for (int i=0; i < tamanho; i++) {
			vetorNum [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
		}
		for (int num : vetorNum) {
			if ((num % 2) != 0) {
				System.out.println(num+" É ímpar.");
			} else if ((num % 10) == 0) {
				System.out.println(num+" É par e multíplo de 10");
			}
		}
	}
}
