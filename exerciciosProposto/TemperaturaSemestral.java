package exerciciosProposto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TemperaturaSemestral {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		List<Mes> temperaturas = new ArrayList<>();
		int count = 6;
		Integer soma = 0;	
		
		for (int i = 1; i <= count; i++) {
			Integer temp;
			switch(i) {
			case 1:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Janeiro",temp));
				soma += temp;
				break;
			case 2:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Fevereiro",temp));
				soma += temp;
				break;
			case 3:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Março",temp));
				soma += temp;
				break;
			case 4:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Abril",temp));
				soma += temp;
				break;
			case 5:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Maio",temp));
				soma += temp;
				break;
			case 6:
				temp = gerador.nextInt(50);
				temperaturas.add(new Mes("Junho",temp));
				soma += temp;
				break;
			
			}
			
		}
		
		for (Mes temperatura : temperaturas) {
			System.out.println(temperatura);
		}
		
		Integer mediaSemestral = soma/6;
		Iterator<Mes> iterator = temperaturas.iterator();
		//Tentei fazer o exercicio usando classe
		//Mas não consegui fazer a comparação para mostrar as temp acima da media
		while(iterator.hasNext()) {
			Integer tempAlta = iterator.next().getTemperatura();
			if(tempAlta > mediaSemestral) {
				System.out.println("Temperatura do mes de"+ iterator.next().getNome() +
						" acima da media: " + tempAlta);
			}
		}
		
		System.out.println("Media Semestral: " + mediaSemestral);
	}
}

class Mes{
	private String nome;
	private Integer temperatura;
	
	public Mes(String nome, Integer temperatura) {
		this.nome = nome;
		this.temperatura = temperatura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getTemperatura() {
		return temperatura;
	}
	
	@Override
	public String toString() {
		return "Mes{" + 
				"nome='" + nome + '\'' +
				", temperatura=" + temperatura +
				'}';
	}
	
}
