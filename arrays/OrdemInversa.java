package arrays;

import java.util.Random;
import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] vetor1 = new int[3];
		int[] vetorInverso = new int[3];
		
		for(int i = 0; i < vetor1.length; i++) {
			vetor1[i] = rd.nextInt(9);
		}

		int count = 0;
		for(int i = vetor1.length-1; i >= 0 ; i--) {
			int num = vetor1[count];
			vetorInverso[i] = num;
			count++;
		}
		
		for(int i: vetor1) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		System.out.println("Vetor Inverso: ");
		
		for(int i: vetorInverso) {
			System.out.print(i + " ");
		}

	}

}
