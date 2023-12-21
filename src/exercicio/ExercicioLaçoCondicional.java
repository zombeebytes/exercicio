package exercicio;

import java.util.Scanner;

//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class ExercicioLaçoCondicional {
	 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);

	 System.out.print("Digite o valor de A: ");
	 int a = leia.nextInt();

	 System.out.print("Digite o valor de B: ");
	 int b = leia.nextInt();

	 System.out.print("Digite o valor de C: ");
	 int c = leia.nextInt();

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