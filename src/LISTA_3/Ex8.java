package LISTA_3;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {

	/*8- Faça um programa que preencha um vetor com 10 números
	 * reais, calcule e mostre a quantidade de números 
	 * negativos e a soma dos números positivos desse vetor.
	 */
	
	private int[] vetor = new int[10];
	
	public void receberValores() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digitar valor (0) ou gerar aleatorio de -100 a 100 (1):");
		int op = leia.nextInt();
		
		if(op == 0) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("Digite o valor para posicao %d: ", i);
				vetor[i] = leia.nextInt();
			}
		} 
		else if (op == 1) {
			Random valorRandom = new Random();

			System.out.println("\nVetor Random:");
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = valorRandom.nextInt(-100,100);
				System.out.print(vetor[i] + " | ");
			}// fim for
			
		} 
		else {
			System.out.println("Valor invalido!");
		} // fim if e else
		
	}// fim metodo
	
	public void qtdNegativos() {
		int qtdNegativo = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] <= -1) {
				qtdNegativo++;
			}
		}
		
		System.out.println("\n\nQuantidade de negativos: " + qtdNegativo);
		
	}// fim metodo
	
	public void somaPositivos() {
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= 0) {
				soma += vetor[i];
			}
		}
		System.out.println("Soma dos positivos: " + soma);
	}
	
}









