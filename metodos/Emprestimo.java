package metodos;

public class Emprestimo {
	
	public static double taxaDuasParcelas() {
		return 0.3;
	}
	
	public static double taxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int qtdParcelas) {
		if(qtdParcelas == 2) {
			double valorFinal = valor + (valor * Emprestimo.taxaDuasParcelas());
			System.out.println("Valor Final do Emprestimo será de "+ valorFinal);
		}else if(qtdParcelas == 3) {
			double valorFinal = valor + (valor * Emprestimo.taxaTresParcelas());
			System.out.println("Valor Final do Emprestimo será de "+ valorFinal);
		}else {
			System.out.println("Verifique a quantidade de parcelas.");
		}
	}
}
