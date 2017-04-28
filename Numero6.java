/*  Escreva um programa Java que leia um vetor de 10 posições e mostre-o. Em seguida, troque o primeiro elemento com o último,
 *  o segundo com o penúltimo, o terceiro com o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca. */

package lista.exercicios.tres;

import java.util.Random;

public class Numero6 {

	public static void main(String[] args) {
		
		System.out.println(
				"Esse programa gera um vetor aleatório de 10 posições.");
		System.out.println("Depois de gerar o vetor, ele irá trocar as posições dele.\n");
		
		int vetor[] = new int[10];

		Random numeros = new Random();

		int aux = 0;
		
		System.out.println("Ordem original:");

		for (int i = 0; i < 10; i++) {

			vetor[i] = numeros.nextInt(10);

			System.out.println("Vetor[" + i + "]: " + vetor[i]);

		}
		
		System.out.println("\n");
		System.out.println("Ordem invertida:");
		
		for (int i = 0; i < 5; i++) {
			
			aux = vetor[9-i];
			vetor[9-i] = vetor[i];
			vetor[i] = aux;

		}
		
		for (int i = 0; i < 10; i++) {

			System.out.println("Vetor[" + i + "]: " + vetor[i]);

		}
	}
}
