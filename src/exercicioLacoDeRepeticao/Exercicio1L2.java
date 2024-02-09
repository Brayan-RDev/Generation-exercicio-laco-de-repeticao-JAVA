package exercicioLacoDeRepeticao;

import java.util.Scanner;

public class Exercicio1L2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int idade, maiores = 0, menores = 0;
		String opcao = "";
		
		System.out.print("Digite a idade: ");
		idade = scanner.nextInt();
		scanner.nextLine();
		
		while(!opcao.equalsIgnoreCase("N") && idade >= 0) {
			if(opcao.equalsIgnoreCase("S")) {
				System.out.print("Digite a idade: ");
				idade = scanner.nextInt();
				scanner.nextLine();
			}
			if(idade < 0) {
				idade = -1;
			}
			else if(idade < 21) {
	        	menores ++;
	            System.out.println("Deseja inserir mais idades?\nDigite (S/N): ");
	            opcao = scanner.nextLine();
	            
	            while(!opcao.equalsIgnoreCase("N") && !opcao.equalsIgnoreCase("S")) {
	            	System.out.println("Opção inválida!\nDigite (S/N): ");
		            opcao = scanner.nextLine();
	            }
	        }
			else if(idade > 50){
	        	maiores ++;
	            System.out.println("Deseja inserir mais idades?\nDigite (S/N): ");
	            opcao = scanner.nextLine();
	            while(!opcao.equalsIgnoreCase("N") && !opcao.equalsIgnoreCase("S")) {
	            	System.out.println("Opção inválida!\nDigite (S/N): ");
		            opcao = scanner.nextLine();
	            }
	        }
		}		
		System.out.print("Total de pessoas menores de 21 anos: " + menores + "\nTotal de pessoas maiores de 50 anos: " + maiores);
		scanner.close();
	}
}