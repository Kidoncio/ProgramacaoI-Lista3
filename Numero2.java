//2) Escreva um programa Java que leia um vetor de 5 posições de números inteiros e mostre somente os positivos.

package lista.exercicios.tres;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];

		System.out.println("Esse programa solicita ao usuário 5 números e separa os positivos.\n\n");
		System.out.println("Entre com 5 valores.");

		for (int i = 0; i < 5; i++) {
			System.out.print("Vetor[" + i + "]: ");
			vetor[i] = sc.nextInt();

		}
		System.out.print("\nNumeros positivos.\n");
		for (int i = 0; i < 5; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println("Vetor[" + i + "] é positivo: " + vetor[i]);

			}
		}

	}

}
