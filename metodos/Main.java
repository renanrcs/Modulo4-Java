package metodos;

public class Main {

	public static void main(String[] args) {
		//Calculadora
		Calculadora.soma(7, 9);
		Calculadora.subtracao(7, 9);
		Calculadora.multiplicacao(7, 9);
		Calculadora.divisao(7, 9);
		
		//Mensagem
		Mensagem.obterMensagem(10);
		Mensagem.obterMensagem(0);
		Mensagem.obterMensagem(15);
		
		//Emprestimo
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, 2);
	}

}
