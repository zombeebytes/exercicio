package exercicio;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {

		float saldo = 1000.00f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tipo de operação a ser realizada:");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Realizar depósito");
		System.out.println("3 - Realizar saque");
		int operacao = scanner.nextInt();
		switch (operacao) {
		case 1:
			System.out.println("Saldo atual: R$ " + saldo);
			break;
		case 2:
			System.out.println("Digite o valor a ser depositado:");
			float deposito = scanner.nextFloat();
			saldo += deposito;
			System.out.println("Novo saldo: R$ " + saldo);
			break;
		case 3:
			System.out.println("Digite o valor a ser sacado:");
			float saque = scanner.nextFloat();
			if (saque <= saldo) {
				saldo -= saque;
				System.out.println("Novo saldo: R$ " + saldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

	}

}
