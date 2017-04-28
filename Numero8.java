/* Faça um programa em Java que receba o código e o preço de 5 produtos, calcule e mostre: 
 * a) a quantidade de produtos com preço inferior a R$ 50
 * b) o código dos produtos com preço entre R$ 50 e R$ 100 
 * c) a média dos preços dos produtos com preço superior a R$ 100. */

package lista.exercicios.tres;

import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float valorProduto[] = new float[5];
		int codigoProduto[] = new int[5];
		int codigoProdutosEntre50100[] = new int[5];
		int quantidadeProdutosInferior50 = 0;
		int mediaPrecos = 0;
		int contador = 0;

		for (int i = 0; i < 5; i++) {

			codigoProduto: while (true) {
				System.out.print("Digite o código do produto Nº " + i + ": #");
				codigoProduto[i] = sc.nextInt();

				if (codigoProduto[i] <= 0) {
					System.out.println("Por favor, digite um valor maior do que zero.");
					continue codigoProduto;
				}
				break;
			}

			valorProduto: while (true) {
				System.out.print("Digite o valor do produo Nº " + i + ": R$ ");
				valorProduto[i] = sc.nextFloat();

				if (valorProduto[i] < 0) {
					System.out.println("\nPor favor, digite um valor maior do que zero.");
					continue valorProduto;
				}
				break;
			}
			System.out.println("\n");

		}

		for (int i = 0; i < 5; i++) {

			if (valorProduto[i] < 50) {

				quantidadeProdutosInferior50++;

			}
			if (valorProduto[i] >= 50 && valorProduto[i] <= 100) {

				codigoProdutosEntre50100[i] = codigoProduto[i];

			}
			if (valorProduto[i] > 100) {

				contador++;
				mediaPrecos = (int) (mediaPrecos + valorProduto[i]);
			}

		}

		System.out.println("___________________________________________________________________________");
		System.out.println(quantidadeProdutosInferior50 + " produtos possuem valor Inferior a R$ 50,00.");
		System.out.println("___________________________________________________________________________");
		System.out.println("\n");

		System.out.println("___________________________________________________________________________");
		System.out.println("Os seguintes códigos possuem valores entre R$ 50,00 e R$ 100,00:");
		for (int i = 0; i < 5; i++) {

			int contadorCodigo = 0;

			if (codigoProdutosEntre50100[i] > 0) {
				System.out.println("#" + codigoProdutosEntre50100[i]);
			} else {
				contadorCodigo++;
			}

			if (contadorCodigo == 5) {
				System.out.println("Nenhum produto possui valor entre R$ 50,00 e R$ 100,00.");
			}

		}
		System.out.println("___________________________________________________________________________");
		System.out.println("\n");

		mediaPrecos = mediaPrecos / contador;

		System.out.println("___________________________________________________________________________");
		System.out.println("A média de preços dos produtos acima de R$ 100,00 é de R$ " + mediaPrecos);
		System.out.println("___________________________________________________________________________");

	}

}
