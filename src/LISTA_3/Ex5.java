package LISTA_3;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	/*5- Escreva um programa que leia 10 números inteiros 
	 * e os armazene em um vetor. Imprima o vetor, o maior 
	 * elemento e a posição que ele se encontra.*/
	
	private int[] vetor = new int[10];
	
	public void armazenaValor() {
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
			
			
			System.out.println("\nVetor:");
			
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = valorRandom.nextInt(100);
				
				System.out.print(vetor[i] + " | ");
			}// fim for
			
		} 
		else {
			System.out.println("Valor invalido!");
		} // fim if e else
		
		
	}// fim metodo
	
	public int valorMaiorPosicao() {
		int maior = 0;
		int posicaoMaior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
		}// fim for
		
		System.out.println("\n\nMaior valor do vetor: " + maior);
		System.out.println("Posicao: " + posicaoMaior);
		
		return maior;
		
	}// fim metodo
	
}// fim class






