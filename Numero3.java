//3) Escreva um programa Java que leia dois vetores de 5 posições e faça a multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante.

package lista.exercicios.tres;

import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		int multiplicacao[] = new int[5];

		System.out.println("Esse programa multiplica os valores entre dois vetores.\n\n");

		for (int i = 0; i < 5; i++) {
			System.out.print("Vetor1[" + i + "]: ");
			vetor1[i] = sc.nextInt();

			System.out.print("Vetor2[" + i + "]: ");
			vetor2[i] = sc.nextInt();
			
			System.out.println("\n");
		}
		System.out.print("\nValores mutliplicados.\n");
		for (int i = 0; i < 5; i++) {
			multiplicacao[i] = vetor1[i] * vetor2[i];
			System.out.println("Vetor1[" + vetor1[i] + "] x Vetor2[" + vetor2[i] + "] = " + multiplicacao[i]);

		}

	}

}
