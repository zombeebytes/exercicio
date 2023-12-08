package exercicio;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		  até que o número zero seja digitado. 
		  Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.*/
		
		 Scanner scanner = new Scanner(System.in);
		 int numero;
		 int soma =0;

		 do {
		 System.out.print(ConsoleColors.RED_BOLD_BRIGHT + "Digite um número inteiro");
		 numero = scanner.nextInt();

		 if (numero >0) {
		 soma += numero;
		 }
		 } while (numero !=0);

		 System.out.println("A soma dos números positivos digitados é: " + soma);
		 }
		}
