//4) Faça um programa Java que leia um código numérico inteiro e um vetor de 8 posições de números reais. Se o código for zero, termine o programa Java. Se o código for 1, mostre o vetor na ordem direta (sequência adquirida/gerada). Se o código for 2, mostre o vetor na ordem inversa.

package lista.exercicios.tres;

import java.util.Scanner;

public class Numero4 {

	static int vetor[] = new int[8];

	public static void main(String[] args) {
		int codigo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Esse programa executa deferentes funçoes dependendo do código escolhido.");

		do {
			System.out.println("\nLista de códigos.");
			System.out.println("0 = Programa para a execução.");
			System.out.println(
					"1 = Programa solicita um vetor de 8 posições e posteriormente mostra a onde cada valor foi armazenado");
			System.out.println(
					"2 = Programa solicita um vetor de 8 posições e posteriormente mostra ele de maneira inversa.\n");
			System.out.print("Código: ");

			codigo = sc.nextInt();

			if (codigo == 0) {
				System.out.println("\nPrograma parou de executar");
				break;
			}
			if (codigo == 1) {
				vetor();
				System.out.println("\nVetor na ordem direta.");
				for(int i = 0; i < 8; i++){
					System.out.println("Vetor[" + i + "] = " + vetor[i]);
				}

			}
			if (codigo == 2) {
				vetor();
				System.out.println("\nVetor na ordem invertida.");
				for(int i = 7; i >= 0; i--){
					System.out.println("Vetor[" + i + "] = " + vetor[i]);
				}

			}
			if (codigo >= 3) {
				System.out.println("\nDigite um valor de código válido.\n");
			}
		} while (codigo >= 3 || codigo < 0);

	}

	public static int vetor() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os valores do vetor.\n");

		for (int i = 0; i < 8; i++) {
			System.out.print("Vetor1[" + i + "]: ");
			vetor[i] = sc.nextInt();
		}
		return 0;
	}
}
