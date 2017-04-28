/* FAÇA UM PROGRAMA JAVA QUE LEIA UM VETOR DE 12 POSIÇÕES DE NÚMEROS INTEIROS E DÍVIDA TODOS OS SEUS ELEMENTOS PELO MAIOR VALOR DO VETOR.
 * MOSTRE O VETOR APÓS OS CÁLCULOS.
 */

package lista.exercicios.tres;

import java.util.Random;

public class Numero7 {

	public static void main(String[] args) {

		System.out.println(
				"Esse programa preenche randomicamente um vetor de 12 posições com números inteiros, variando de 0 até 9");

		int vetor[] = new int[12];

		Random numeros = new Random();

		int aux = 0;
		int maiorValor = 0;

		for (int i = 0; i < 12; i++) {

			vetor[i] = numeros.nextInt(10);

			System.out.println("Vetor[" + i + "]: " + vetor[i]);

			aux = vetor[i];

			if (aux > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		System.out.println("O maior valor desse vetor é: " + maiorValor);

		System.out.println("\nDividindo todos os elementos pelo maior valor, é possível encontrar: ");

		int resultadoDivisao = 0;

		for (int i = 0; i < 12; i++) {

			resultadoDivisao = vetor[i] / maiorValor;

			vetor[i] = resultadoDivisao;

			System.out.println("Vetor[" + i + "]: " + vetor[i]);

		}

	}

}
