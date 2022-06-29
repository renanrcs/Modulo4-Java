package exerciciosProposto;

import java.util.*;

public class Exercicio1Set {

	public static void main(String[] args) {
		//Crie um conjunto contendo as cores do arco-iris
		Set<String> coresArcoIres = new HashSet<>();
		
		coresArcoIres.add("Vermelho");
		coresArcoIres.add("Laranja");
		coresArcoIres.add("Amarelo");
		coresArcoIres.add("Verde");
		coresArcoIres.add("Azul");
		coresArcoIres.add("Anil");
		coresArcoIres.add("Violeta");
		
		//Exiba todas as cores uma abaixo da outra;
		for (String cor : coresArcoIres) {
			System.out.println(cor);
		}
		
		//A quantidade de cores que o arco-iris tem;
		System.out.println("A quantidade de cores que o arco-íris tem: " +coresArcoIres.size());
		
		
		//Exiba as cores em ordem alfabetica;
		Set<String> cores2 = new TreeSet<>(coresArcoIres);
		System.out.println(cores2);
		
		//Exiba as cores na ordem Inversa que foi Informada;
		Set<String> cores3 = new LinkedHashSet<>(coresArcoIres);
		System.out.println(cores3);
		
		//Exiba todas as cores que começam com a leta 'V';
		for(String corStartV : coresArcoIres) {
			if(corStartV.startsWith("V")) System.out.println(corStartV);
		}
		
		//Remova todas as cores que NÃO começam com a letra 'V';
		Iterator<String> imprime = coresArcoIres.iterator();
		while(imprime.hasNext()) {
			if(!imprime.next().startsWith("V")) imprime.remove();
		}
		System.out.println(coresArcoIres);
		
		//Limpe o conjunto;
		coresArcoIres.clear();
		
		//Confira se o conjunto esta vazio;
		System.out.println("Conjunto está vazio? " + coresArcoIres.isEmpty());
	}

}
