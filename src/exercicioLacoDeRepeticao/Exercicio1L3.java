package exercicioLacoDeRepeticao;

import java.util.Scanner;

public class Exercicio1L3 {

	public static void main(String[] args) {
		int valor, auxiliar = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite a idade: ");
			valor = scanner.nextInt();
			scanner.nextLine();
			
			if(valor > 0) {
				auxiliar = auxiliar + valor;
			}
		}while(valor != 0);
		
		System.out.print("A soma dos números positivos é: " + auxiliar);
	}
}
