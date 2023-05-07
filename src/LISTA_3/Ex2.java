package LISTA_3;

import java.util.Scanner;

public class Ex2 {

	/*2- Crie um programa que lê 6 valores inteiros e, em seguida, 
	 * mostre na tela os valores lidos.
	 */
	
	private int[] valor = new int[6];
	
	public void valorRecebido() {
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < valor.length; i++) {
			System.out.printf("Digite um valor inteiro para %d: ", i);
			valor[i] = leia.nextInt();
		}// fim for
		
	}// fim metodo
	
	public void mostrarValores() {
		
		System.out.println();
		
		for (int i = 0; i < valor.length; i++) {
			System.out.printf("Valor %d da posicao %d.\n", i, valor[i]);
		}// fim for
		
	}// fim metodo
	
}// fim class
