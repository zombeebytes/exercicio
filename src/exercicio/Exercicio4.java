package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
		 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total 
		 * de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		 */
		 int idade;
		 int menor21 =0;
		 int maior50 =0;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(ConsoleColors.ANSI_PURPLE + "Digite a sua idade:");
		 do {
		  idade = scanner.nextInt();
		 if (idade <21 && idade >=0) {
		 menor21++;
		 } else if (idade >50) {
		 maior50++;
		 }
		 } while (idade >=0);
		 System.out.println("Total de pessoas com idade menor que21 anos: " + menor21);
		 System.out.println("Total de pessoas com idade maior que50 anos: " + maior50);
		 }
		
	}


