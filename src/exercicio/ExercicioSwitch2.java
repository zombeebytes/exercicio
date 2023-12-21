package exercicio;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o primeiro numero: ");
	float num1 = scanner.nextFloat();
	System.out.println("Digite o segundo numero: ");
    float num2 = scanner.nextFloat();
	System.out.println("Digite a operação desejada ('1 - Soma, 2 - Subtração, 3 - Divisão, 4 - Multiplicação): ");
    int operacao = scanner.nextInt();
    float resultado;
    
    switch (operacao) {
    case 1: resultado = num1 + num2;
    System.out.println("Resultado: " + resultado);
    break;
    case 2: resultado = num1 - num2;
    System.out.println("Resultado: " + resultado);
    break;
    case 3:  if(num2 !=0) {
    	resultado = num1 / num2;
    System.out.println("Resultado: " + resultado);
    }else { 
    	System.out.println("Não é possível dividir por zero.");
    }
    break;
    case 4: resultado = num1 * num2;
    System.out.println("Resultado: " + resultado);
    break;
    default: 
    	System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Operação inválida!");
    	break;
    }
    
    
	}

}
