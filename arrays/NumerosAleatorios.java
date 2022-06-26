package arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Faça umprograma que leia 20 numeros inteiros aleatorios entre (0 & 100)
 * armazene-os num vetor.
 * Ao final mostre os numeros e seus sucessores.
 * */

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = gerador.nextInt(100);
		}
		
		for(int numeros: numerosAleatorios) {
			System.out.print(numeros + " -> ");
			System.out.println(++numeros);
		}

	}

}
