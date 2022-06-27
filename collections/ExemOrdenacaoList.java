package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemOrdenacaoList {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("John", "18", "preto"));
			add(new Gato("Simba", "6", "tigrado"));
			add(new Gato("John", "12", "amarelo"));
		}};
		
		System.out.println("---\tOrdem de inserção\t---");
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem aleatoria\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem natural (nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
	}
	
}

class Gato implements Comparable<Gato>{
	private String nome;
	private String idade;
	private String cor;
	
	public Gato(String nome, String idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	@Override
	public String toString() {
		return "Gato{" + 
				"nome='" + nome + '\'' +
				", idade=" + idade +
				" cor='" + cor + '\'' +
				'}';
				
				
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}
