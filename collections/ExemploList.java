package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		// Dada uma lista com 7 notas de um aluno [7, 8, 6, 9, 6, 8, 10, 7], faça:
		
		//List notas = new ArrayList(); //antes do Java 5
		//ArrayList<Double> notas = new ArrayList<>();
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(7.0);
		notas.add(9.0);
		notas.add(10.0);
		
		System.out.println(notas);
		System.out.println(notas.indexOf(9.0));
		
		notas.add(4, 6.5);
		
		System.out.println(notas);
		
		notas.set(notas.indexOf(10.0), 8.5);//mtd de substituição passando a posição
		System.out.println(notas);
		
		System.out.println("Confira se uma nota existe");
		
		System.out.println("Nota existe? " + notas.contains(5d));
		
		/*for(Double nota: notas) {
			System.out.println(nota);
		}*/
		
		System.out.println("Exiba a 3ª nota adicionada " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		notas.set(2, 10d);
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println("Exiba a soma dos valores: " + soma);
		System.out.println("Exiba a media das notas: " + soma/notas.size());
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0); //Passando indice
		notas.remove(9.0); //Passando Objeto
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista");
		
		Iterator<Double> verifica = notas.iterator();
		
		while(verifica.hasNext()) {
			Double notaBaixa = verifica.next();
			if(notaBaixa < 7.0) {
				verifica.remove();
			}
		}
		
		System.out.println(notas);
		
		System.out.println("Apague toda a lista");
		notas.clear();
		
		System.out.println(notas);
		
		System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
		
		/*Resolva esses execicio utilizando os metodos da implementação LinkedList
		 * 
		 * *Crie uma lista chamada lista2
		 * 
		 * *Mostre a primeira nota da nova lista sem remove-la
		 * 
		 * *MOstre a primeira nota da nova lista e remova
		 * 
		 * */

	}

}
