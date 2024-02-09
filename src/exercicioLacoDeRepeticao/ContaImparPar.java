package exercicioLacoDeRepeticao;

import java.util.Scanner;

public class ContaImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i, valor, impar = 0, par = 0;

		for(i = 1; i <= 10; i++) {
			System.out.print("Digite " + i + "° valor: ");
	        valor = scanner.nextInt();
	        
	        if(valor % 2 == 0) {
	        	par ++;
	        }
	        else {
	        	impar ++;
	        }
		}
		
		System.out.print("Total de números pares: " + par + "\nTotal de números impares: " + impar);
		scanner.close();
	}
}
 