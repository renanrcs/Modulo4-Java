package estruturasRepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero para lhe mostrarmos o Fatorial");
		int fatorial = sc.nextInt();
		
		System.out.print("Fatorial "+fatorial+"! = ");
		for(int i = fatorial-1; i >= 1; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);

	}

}
