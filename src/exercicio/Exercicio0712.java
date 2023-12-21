package exercicio;

import java.util.Scanner;

public class Exercicio0712 {

	public static void main(String[] args) {
		/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se
		  a soma de A + B é maior, menor ou igual a C.*/
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Digite o valor de A: ");
		 int a = scanner.nextInt();

		 System.out.print("Digite o valor de B: ");
		 int b = scanner.nextInt();

		 System.out.print("Digite o valor de C: ");
		 int c = scanner.nextInt();

		 int soma = a + b;

		 if (soma > c) {
		 System.out.println("A soma de A + B é maior que C.");
		 } else if (soma < c) {
		 System.out.println("A soma de A + B é menor que C.");
		 } else {
		 System.out.println("A soma de A + B é igual a C.");
		 }
		 }
		}
