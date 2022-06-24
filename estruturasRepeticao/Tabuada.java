package estruturasRepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int consultar = 1;
		
		do {
			System.out.println("Qual tabuada entre 0 & 10 deseja consultar?");
			int tabu = sc.nextInt();
			
			System.out.println("Tabuada de "+tabu+":");
			for(int i = 0; i < 11; i++) {
				System.out.println(tabu +" x "+ i + " = " +tabu * i);
			}
			
			System.out.println("deseja fazer nova consulta?\n 1 - para SIM\n 2 - para NÃO");
			consultar = sc.nextInt();
			
		}while(consultar == 1);

	}

}
