package LISTA_3;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {

/*7- Faça um programa para ler a nota da prova de 15 alunos 
 * e armazene num vetor, calcule e imprima a média geral.
*/
	
	private double[] notasVetor = new double[15];
	private double mediaGeral;
	
	public void receberNotas() {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digitar notas(0) ou gerar aleatoriamente(1):");
		int op = leia.nextInt();
		
		if (op == 0) {
			for(int i = 0; i < notasVetor.length; i++) {
				System.out.printf("Digite as notas do aluno %d: ", i);
				notasVetor[i] = leia.nextDouble();
			}
		}
		else if (op == 1) {
			Random obj = new Random();
			
			for (int i = 0; i < notasVetor.length; i++) {
				notasVetor[i] = obj.nextDouble(10.0);
			}
		}
		else {
			System.out.println("Opcao invalida!");
		}
		
		System.out.println("\nNotas dos alunos: ");
		for (int i = 0; i < notasVetor.length; i++) {
			System.out.printf("Aluno %d - Nota %.2f.\n", i, notasVetor[i]);
		}
		
	}// fim metodo
	
	public void mediaNotas() {
		double soma = 0.0;
		
		// somar notas
		for (int i = 0; i < notasVetor.length; i++) {
			soma += notasVetor[i];
		}
		
		// media
		mediaGeral = soma / notasVetor.length;
		
		System.out.printf("\nMedia geral: %.2f", mediaGeral);
		
	}// fim metodo
	
}// fim class










