package exercicio;

import java.util.Scanner;

public class Exercicio3 {
	/*Escreva um algoritmo em Java, que leia 10 números inteiros 
	 * via teclado e mostre na tela quantos números são pares e quantos número são ímpares.
	 */

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		int numero;
        Scanner leia = new Scanner(System.in);
		

		
		for (int i = 1; i <= 10; i++) {
			System.out.println("digite o " +i+"° numero");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);

		
	}

}
