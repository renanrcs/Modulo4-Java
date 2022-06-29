package exerciciosProposto;

import java.util.*;

public class Exercicio2Set {

	public static void main(String[] args) {

		Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();

		// Crie um conjunto com 3 linguagens;
		linguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Intelij"));
		linguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio code"));

		// Ordem de Inserção;
		Set<LinguagemFavorita> linguagensFavoritas2 = new LinkedHashSet<>(linguagensFavoritas);
		for (LinguagemFavorita linguagem : linguagensFavoritas2)
			System.out.println(linguagem);

		System.out.println("==========================================================");

		// Ordem Natural (nome);
		Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(linguagensFavoritas);
		for (LinguagemFavorita linguagem : linguagensFavoritas3)
			System.out.println(linguagem);

		System.out.println("===================================================================");

		// IDE -> Agora devemos criar uma classe de comparação pra ide;
		Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new comparatorIde());
		linguagensFavoritas4.addAll(linguagensFavoritas);// .addAll adiciona todos elementos;
		for (LinguagemFavorita lingFav4 : linguagensFavoritas4)
			System.out.println(lingFav4);

		System.out.println("===================================================================");
		
		//Ano de Criação e Nome; -> Criar classe de comparação para Ano de Criação e Nome;
		Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new comparatorAnoENome());
		linguagensFavoritas5.addAll(linguagensFavoritas);
		for(LinguagemFavorita lingFav5 : linguagensFavoritas5) 
			System.out.println(lingFav5);
		
		System.out.println("===================================================================");
		
		//Nome, Ano deCriação e IDE; -> Criar uma classe de comparação para Nome, Ano, IDE;
		Set<LinguagemFavorita> linguagensFavoritas6 = new TreeSet<LinguagemFavorita>(new comparatorNomeAnoIDE());
		linguagensFavoritas6.addAll(linguagensFavoritas);
		for(LinguagemFavorita lingFav6 : linguagensFavoritas6) 
			System.out.println(lingFav6);
		
		System.out.println("===================================================================");
		
		//Mostrar no console uma abaixo da outra;
		
	}

}

//Crie uma classe LinguegemFavorita que possua atributos: nome, ano, IDE;
class LinguagemFavorita implements Comparable<LinguagemFavorita> {

	private String nome;
	private int ano;
	private String ide;

	public LinguagemFavorita(String nome, int ano, String ide) {
		this.nome = nome;
		this.ano = ano;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "LinguagemFavorita [nome=" + nome + ", ano=" + ano + ", ide=" + ide + "]";
	}

	@Override
	public int compareTo(LinguagemFavorita linguagemFavorita) {
		// Sobrescrever este metodo;
		return this.nome.compareTo(linguagemFavorita.nome);
	}
	
	
}

class comparatorIde implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
		return lf1.getIde().compareToIgnoreCase(lf2.getIde());
	}
}

class comparatorAnoENome implements Comparator<LinguagemFavorita> {
	
	@Override
	public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
		int anoDeCriacao = Integer.compare(lf1.getAno(), lf2.getAno());
		if(anoDeCriacao != 0) return anoDeCriacao;
			return lf1.getNome().compareToIgnoreCase(lf2.getNome());
	}	
}

class comparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
	@Override
	public int compare(LinguagemFavorita lF1, LinguagemFavorita lF2) {
		int nome = lF1.getNome().compareToIgnoreCase(lF2.getNome());
		int ano = Integer.compare(lF1.getAno(), lF2.getAno());
		if(nome != 0) return nome;
		if(ano != 0) return ano;
			return lF1.getIde().compareToIgnoreCase(lF2.getIde());
	}
}
