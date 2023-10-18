package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		boolean continuar = true;
		
		System.out.println("C A L C U L A D O R A ");
		
		do {
			System.out.print("Informe um valor: ");
			double num1 = leitor.nextDouble();
			System.out.print("Informe outro valor: ");
			double num2 = leitor.nextDouble();
			
			System.out.println("--------------------------------------------");
			System.out.println("1 - Adicao");
			System.out.println("2 - Subtracao");
			System.out.println("3 - multiplicacao");
			System.out.println("4 - Divisao");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.print("Informe a opcao: ");
			int opcao = leitor.nextInt();
			double resultado;
			
			switch(opcao) {
				case 1: 
					//adicao
					resultado = num1 + num2;
					System.out.printf("Resultado da adição: %.2f\n", resultado);
					break;
					
				case 2:
					//subtracao
					resultado = num1 - num2;
					System.out.printf("Resultado da subtração: %.2f\n", resultado);
					break;
					
				case 3:
					//multiplicacao
					resultado = num1 * num2;
					System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
					break;
					
				case 4:
					//divisão
					resultado = num1 / num2;
					System.out.printf("Resultado da divisão: %.2f\n", resultado);
					break;
					
				default:
					System.out.print("Opção inválida");
					break;
			}
			
			System.out.println("Deseja continuar: 1 - Sim / 2 - Não");
			
			int cont = leitor.nextInt();
			if (cont == 2 ) {
				continuar = false;
				System.out.println("Encerrando...");
			}
			
		}
		while(continuar);
	}

}
