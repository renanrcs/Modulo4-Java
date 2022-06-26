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
			System.out.println(vetor1[i]);
		}
		//Tentar resolver
		System.out.println("==========");
		int count = 0;
		for(int i = vetor1.length-1; i >= 0 ; i--) {
			vetorInverso[i] = vetor1[count];
			System.out.println(vetorInverso[i]);
			count++;
		}

	}

}
