package LISTA_3;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	/*6- Crie um programa que lê 6 valores inteiros e, em 
	 * seguida, mostre na tela os valores lidos na ordem 
	 * inversa. */
	
	private int[] vetor = new int[6];
	
	public void armazenarValor() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digitar valor (0) ou gerar aleatorio (1):");
		int op = leia.nextInt();
		
		if(op == 0) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("Digite o valor para posicao %d: ", i);
				vetor[i] = leia.nextInt();
			}
		} 
		else if (op == 1) {
			Random valorRandom = new Random();

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = valorRandom.nextInt(100);
			}// fim for
			
		} 
		else {
			System.out.println("Valor invalido!");
		} // fim if e else
		
	}// fim metodo
	
	public void ordemInversaVetor() {
		System.out.println("\nVetor original:");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i] + " | ");
		}

		System.out.println("\n\nVetor em ordem inversa:");
		for (int i = vetor.length - 1; i >= 0; i--) {
		    System.out.print(vetor[i] + " | ");
		}
	}
	
}// fim class








