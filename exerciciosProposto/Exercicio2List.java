package exerciciosProposto;

import java.util.*;

public class Exercicio2List {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> respostas = new ArrayList<>();
		
		int numRespostas = 0;
		
		System.out.println("Telefonou para a vitima?");
		respostas.add(scan.next());
		
		System.out.println("Esteve no local do crime?");
		respostas.add(scan.next());
		
		System.out.println("MOra perto da vitima??");
		respostas.add(scan.next());
		
		System.out.println("Devia para a vitima?");
		respostas.add(scan.next());
		
		System.out.println("Já trabalhou com a vitima?");
		respostas.add(scan.next());
		
		Iterator<String> iter = respostas.iterator();
		
		while (iter.hasNext()) {
			if(iter.next().equalsIgnoreCase("Sim")) {
				numRespostas++;
			}
		}
		
		switch (numRespostas) {
		case 2: 
			System.out.println("Suspeita");
			break;
		case 3: 
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5: 
			System.out.println("Assassina");
			break;
		default:
			System.out.println("Inocente");
			break;
		}
	
	}

}
