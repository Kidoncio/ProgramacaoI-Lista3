/* Criar um algoritmo que leia os elementos de uma matriz 5
X 5 e mostre os elementos da diagonal 
principal  e  mostre  os  elementos  da  abaixo  da  diagonal  principal.  Dica:  Elementos  da  diagonal 
principal linha = coluna; e, elementos da abaixo da diagonal principal linha > coluna.*/

package lista.exercicios.tres;

import java.util.Random;

public class Numero10 {
	public static void main(String[] args) {

		Random gerador = new Random(10);

		int[][] matriz = new int[5][5];

		int i = 0;
		int j = 0;

		System.out.println(" Matriz");
		for (i = 0; i < 5; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (i = 0; i < 5; i++) {
			System.out.print("|");
			for (j = 0; j < 5; j++) {
				matriz[i][j] = gerador.nextInt(10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("|");
		}
		for (i = 0; i < 5; i++) {
			System.out.print("__");
		}
		System.out.println("\n\n");

		boolean resultado = true;

		while (resultado == true) {

			System.out.println("Diagonal principal:");
			for (i = 0; i < 5; i++) {
				System.out.println("\t");
				for (j = 0; j < 5; j++) {
					if (i == j) {
						System.out.print(" " + matriz[i][j]);
					}
				}
			}
			System.out.println("\n");
			System.out.println("Número abaixo da diagonal principal:");
			for (i = 0; i < 5; i++) {
				System.out.println("\t");
				for (j = 0; j < 5; j++) {
					if (i > j) {
						System.out.print(" " + matriz[i][j]);
					}

				}
			}
			System.out.println("\n");

			resultado = false;
		}

	}

}
