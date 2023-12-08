package exercicio;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa. No intervalo informado, mostre na tela todes os números que são
		 * múltiplos de 3 e 5.
		 */
               
		try (Scanner leia = new Scanner(System.in)) {
			for (int num = 6; num < 7; num++) {

				System.out.print("\nDigite o primeiro numero:");
				
				int primeiro = leia.nextInt();

				System.out.print("\nDigite o segundo numero:");
				int segundo = leia.nextInt();

				if (primeiro > segundo) {
					System.out.println("Intervalo inválido");
                 System.exit(0);
				} 
				int s = primeiro;
				while(s<=segundo) {
					if(s%3 == 0&&s%5 == 0) {
						System.out.println(s + " é multiplo de 3 e 5");
					}
					s ++;
				}
					
				}

			}
		}
	}


