/* Um desenho de tamanho m x n pode ser representada por uma matriz cujos elementos assumem 
valores no conjunto {0,1}. Dado um padrãorepresentado por uma matriz 3x3 também assumindo 
valores  em  {0,1}, escreva um  programa  em  Java  que  determine  se  o  padrão  existe  ou  não  no 
desenho. A Figura 2 il ustra o funcionamento do programa */

package lista.exercicios.tres;

import java.util.Random;
import java.util.Scanner;

public class Numero11 {
	public static void main(String[] args) {

		Random gerador = new Random(10);
		Scanner sc = new Scanner(System.in);
		
		int linhas = 0;
		int colunas = 0;
		
		int[][] matrizPadrao = new int[3][3];

		int i = 0;
		int j = 0;

		
		System.out.println("Determine o tamanho da Matriz.");
		
		System.out.print("Digite a quantidade de linhas: ");
		linhas = sc.nextInt();
		
		System.out.print("Digite a quantidade de colunas: ");
		colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];


		System.out.println(" Matriz");
		for (i = 0; i < linhas; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (i = 0; i < linhas; i++) {
			System.out.print("|");
			for (j = 0; j < colunas; j++) {
				matriz[i][j] = gerador.nextInt(2);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("|");
		}
		for (i = 0; i < linhas; i++) {
			System.out.print("__");
		}
		System.out.println("\n\n");
		
		
		
		matrizPadrao[0][0] = 0;
		matrizPadrao[0][1] = 1;
		matrizPadrao[0][2] = 0;
		matrizPadrao[1][0] = 1;
		matrizPadrao[1][1] = 1;
		matrizPadrao[1][2] = 1;
		matrizPadrao[2][0] = 0;
		matrizPadrao[2][1] = 1;
		matrizPadrao[2][2] = 0;
		
		System.out.println("Matriz Padrão");
		for (i = 0; i < 3; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (i = 0; i < 3; i++) {
			System.out.print("|");
			for (j = 0; j < 3; j++) {
				System.out.print(matrizPadrao[i][j] + " ");
			}
			System.out.println("|");
		}
		for (i = 0; i < 3; i++) {
			System.out.print("__");
		}
		System.out.println("\n\n");
		
		int contador = 0;
		int[][] matrizResultado = new int[linhas][colunas]; 
		
		for(i = 0; i < linhas - 2; i++){
			for(j = 0; j < colunas - 2; j++){
				if(matriz[i][j] == 0 && matriz[i][j + 1] == 1 && matriz[i][j + 2] == 0){
					if(matriz[i + 1][j] == 1 && matriz[i + 1][j + 1] == 1 && matriz[i + 1][j + 2] == 1){
						if(matriz[i + 2][j] == 0 && matriz[i + 2][j + 1] == 1 && matriz[i + 2][j + 2] == 0){
							contador++;					
						}
					}
				}
			}
		}
		
		if(contador == 0){
			System.out.println("Não foi encontrado nenhum padrão nessa matriz.");
		}else if(contador == 1){
			System.out.println("Foi encontrado "+ contador +" padrão nessa matriz.");
		}
		else{
			System.out.println("Foram encontrados "+ contador +" padrões nessa matriz.");
		}
	}

}
