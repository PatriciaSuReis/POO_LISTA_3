package LISTA_3;

import java.util.Arrays;

	/*1- Faça um programa que possua um vetor denominado A que armazene 6 
	 * números inteiros. O programa deve executar os seguintes passos:
	 * A. Implemente um método que atribua os seguintes valores a esse vetor: 
	 * 1, 0, 5, -2, -5, 7.
	 * B. Implemente um método que armazene em uma variável inteira (simples) a
	 * soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela
	 * esta soma. 
	 * C. Implemente um método que modifique o vetor na posição 4, atribuindo a esta
	 * posição o valor 100 e imprima o array.
	 * D. Implemente uma classe de teste para testar os itens A, B e C.*/

public class Ex1 {
	// declando array
	private int[] A = new int[6];
	
	public void metodoA() {
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		System.out.println("Valores atribuidos.");
		
		for (int i = 0; i < A.length; i++) {
			System.out.printf("Valor %d da posicao %d.\n", i, A[i]);
		}
		
	}// fim metodo
	
	public void metodoB() {
		int soma;

		soma = A[0] + A[1] + A[5];
		
		System.out.printf("\nA soma %d das posicoes 0, 1 e 5.", soma);
		
	}// fim metodo B
	
	public void metodoC() {
		
		A[4] = 100;
		
		System.out.printf("\nA nova valor da posicao 4 e %d.", A[4]);
	}// fim metedo C
	
}// fim class










