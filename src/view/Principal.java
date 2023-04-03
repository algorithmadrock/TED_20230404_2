package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception {
		JOptionPane.showMessageDialog(null, "VETOR[16] = {0, 5, 7, -4, -3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5}");
		int[] vetor = {0, 5, 7, -4, -3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		Controller.Pilha(vetor);
	}

}
