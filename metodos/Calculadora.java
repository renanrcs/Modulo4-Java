package metodos;

public class Calculadora {
	
	public static void soma(double a, double b) {
		double resultado = a + b;
		System.out.println("A soma de "+a+" + "+b+" � igual �: "+resultado);
	}
	
	public static void subtracao(double a, double b) {
		double resultado = a - b;
		System.out.println("A Subtra��o de "+a+" + "+b+" � igual �: "+resultado);
	}
	
	public static void multiplicacao(double a, double b) {
		double resultado = a * b;
		System.out.println("A Multiplica��o de "+a+" + "+b+" � igual �: "+resultado);
	}
	
	public static void divisao(double a, double b) {
		double resultado = a / b;
		System.out.println("A Divis�o de "+a+" + "+b+" � igual �: "+resultado);
	}
}
