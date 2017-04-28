/*1) Escreva um programa em Java no qual deve apresentar a declaração uma variável array inteira chamada dados com 6 elementos e, usando um inicializador de array, inicialize-a com os valores 1, 4, 9, 16, 25, 36. Em seguida, utilize um loop for para imprimir os valores de cada um destes elementos. A saída do seu programa deverá ser a seguinte:
• O elemento de índice 0 vale 1.
• O elemento de índice 1 vale 4.
• O elemento de índice 2 vale 9.
• O elemento de índice 3 vale 16.
• O elemento de índice 4 vale 25.
• O elemento de índice 5 vale 36.
*/



package lista.exercicios.tres;

public class Numero1 {

	public static void main(String[] args) {
		
		int[] dados = {1,4,9,16,25,36};
		
		for	(int i = 0; i < 6; i++){
			System.out.println("O elemento de indíce "+ i +" vale " + dados[i]+".");
		}
		

	}

}
