package estruturasRepeticao;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros;
		int numPares = 0;
		int numImpares = 0;
		
		System.out.println("Informe a quantidades de numeros a ser informada");
		qtdNumeros = sc.nextInt();
		
		for(int i = 1; i <= qtdNumeros; i++) {
			System.out.println("Informe o numero");
			int num = sc.nextInt();
			if((num % 2) == 0) {
				numPares++;
			}else {
				numImpares++;
			}
		}
		
		System.out.println("Quantidade de numeros pares foi de: " + numPares);
		System.out.println("Quantidade de numeros Impares foi de: " + numImpares);

	}

}
