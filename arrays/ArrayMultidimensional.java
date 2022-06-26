package arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Gere e imprima uma matriz M 4 x 4 com valores aleatorios entre (0 & 9)
 * */

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = gerador.nextInt(9);
			}
		}
		
		for(int[] linha: matriz) {
			for(int coluna: linha) {
			System.out.print(coluna + " ");
			}
			System.out.println();
		}

	}

}
