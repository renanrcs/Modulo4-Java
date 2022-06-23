package metodos;

public class Calculadora {
	
	public static void soma(double a, double b) {
		double resultado = a + b;
		System.out.println("A soma de "+a+" + "+b+" é igual á: "+resultado);
	}
	
	public static void subtracao(double a, double b) {
		double resultado = a - b;
		System.out.println("A Subtração de "+a+" + "+b+" é igual á: "+resultado);
	}
	
	public static void multiplicacao(double a, double b) {
		double resultado = a * b;
		System.out.println("A Multiplicação de "+a+" + "+b+" é igual á: "+resultado);
	}
	
	public static void divisao(double a, double b) {
		double resultado = a / b;
		System.out.println("A Divisão de "+a+" + "+b+" é igual á: "+resultado);
	}
}
