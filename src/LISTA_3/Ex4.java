package LISTA_3;

import java.util.Iterator;
import java.util.Random;

public class Ex4 {

	/*4- Leia um vetor de 10 posições. Contar e escrever 
	 * quantos valores pares ele possui.*/
	
	private int[] vetor = new int[10];
	
	public void randomVetor() {
		Random valorRandom = new Random();
		
		System.out.println("Valores aleatorio de 1 a 100.");
		System.out.println("\nVetor:");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = valorRandom.nextInt(100);
			
			System.out.print(vetor[i] + " | ");
		}

	}//fim metodo
	
	public void paresVetores() {
		
		System.out.println("\n\nValores pares: ");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {	
				System.out.print(vetor[i] + " | ");
			}
		}// fim for
		
	}// fim metodo
	
}// fim class






