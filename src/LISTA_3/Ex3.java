package LISTA_3;

import java.util.Scanner;

public class Ex3 {

	/*3- Ler um conjunto de números reais, armazenando-o 
	 * em vetor e calcular o quadrado dos componentes deste 
	 * vetor, armazenando o resultado em outro vetor, em
	 * seguida Imprimir ambos os vetores.
	 */
	
	private int n;
	private int[] vetor;
    private int[] vetorQuadrado;
	
	public void armazenar() {
		Scanner leia = new Scanner(System.in);
		
		// ler o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();

        vetor = new int[tamanho];
        vetorQuadrado = new int[tamanho];
		
        System.out.println();
        
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Digite um valor para %d: ", i);
			vetor[i] = leia.nextInt();			
		}
		
	}// fim metodo
	
	public void calcularQuadrado() {
        for (int i = 0; i < vetor.length; i++) {
        	vetorQuadrado[i] = vetor[i] * vetor[i];
        }
    }// fim metodo

	 public void imprimirVetores() {
	    System.out.println("\nVetor:");
	    for (int i = 0; i < vetor.length; i++) {
	        System.out.print(vetor[i] + " ");
	    }

	    System.out.println("\nQuadrado:");
	    for (int i = 0; i < vetorQuadrado.length; i++) {
	        System.out.print(vetorQuadrado[i] + " ");
	    }
	 }// fim metodo
	
	
}







