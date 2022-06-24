package estruturasRepeticao;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Informe o valor da nota");
		nota = sc.nextInt();
		//Ex da Professora
		while(nota < 0 | nota > 10) {
			System.out.println("Nota invalida, informe novamente");
			nota = sc.nextInt();
		}
		
		//Exemplo abaixo eu tentei antes da Professora
		/*
		do {
			System.out.println("Informe o valor da nota");
			nota = sc.nextInt();
			if(nota < 0 || nota > 10) {
				System.out.println("Valor invalido");
			}
		}while(nota < 0 || nota > 10);*/

	}

}
