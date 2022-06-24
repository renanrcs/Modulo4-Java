package estruturasRepeticao;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int maior = 0;
		int media = 0;
		int cont = 0;
		
		do {
			System.out.println("Informe um numero");
			int num = sc.nextInt();
			if(maior < num) {
				maior = num;
			}
			total += num; 
			cont++;
		}while(cont < 5);
		media = total/cont;
		System.out.println("A media dos numeros informados é de: "+media);
		System.out.println("O maior numero informado foi: "+maior);

	}

}
