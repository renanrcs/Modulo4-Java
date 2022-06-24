package estruturasRepeticao;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int idade;
		
		while(true) {
			System.out.println("Informe o nome");
			nome = sc.next();
			if(nome.equals("0")) {
				break;
			}
			System.out.println("Informe a idade");
			idade = sc.nextInt();
		}
		
		System.out.println("Continua aqui...");
	}

}
