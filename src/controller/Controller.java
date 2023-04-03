/*
RESUMO      : Exercicio 2, classe de criação da pilha
PROGRAMADORA: Luiza Felix
DATA        : 02/04/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class Controller {
	public static void Pilha(int[] vetor) throws Exception {
		IntPilha pilha = new IntPilha();
		
		for (int i: vetor) { //essa variável incorpora os valores dentro das posições do vetor, não o seu índice
			if (i>=0) {
				pilha.push(i);
			} else {
				int soma = pilha.pop() + pilha.pop();
				pilha.push(i);
				pilha.push(soma);
			}
		}
		System.out.println("PILHA:	" + pilha.toString() + "\nTAMANHO:	" + pilha.size());
	}

}
