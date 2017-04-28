/* Escreva um programa Java que leia um vetor de 8 elementos inteiros. Encontre e mostre o menor elemento e sua posição no vetor. */

package lista.exercicios.tres;

import java.util.Random;

public class Numero5 {

	public static void main(String[] args) {

		System.out.println(
				"Esse programa preenche randomicamente um vetor de 8 posições com números inteiros variando de 0 até 9");

		int vetor[] = new int[8];

		Random numeros = new Random();

		int aux = 9;
		int menorValor = 9;
		int posicaoVetor = 9;

		for (int i = 0; i < 8; i++) {

			vetor[i] = numeros.nextInt(10);

			System.out.println("Vetor[" + i + "]: " + vetor[i]);

			aux = vetor[i];

			if (aux < menorValor) {
				menorValor = vetor[i];
				posicaoVetor = i;
			}
		}

		System.out.println("O menor valor é: " + menorValor);
		System.out.println("Esse valor se encontra na posição " + posicaoVetor + " do vetor");

	}
}
