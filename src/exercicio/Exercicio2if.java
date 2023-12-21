package exercicio;

import java.util.Scanner;

public class Exercicio2if {
//	Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem 
//	indicando se este número é par ou ímpar e se o número é positivo ou negativo. Entrada e saída de dados, 
//	operadores e laço condicional if.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int numero = scanner.nextInt();
		if(numero%2==0) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é impar!");						
		}
		if(numero>=0) {
			System.out.println("O número é positivo!");
		}else {
			System.out.println("O número é negativo!");
		}

		}
	}

