package retornos;

public class Main {

	public static void main(String[] args) {
		
		double areaQuadrado = Quadrilateros.area(5);
		System.out.println("Area do quadrado é igual á: "+ areaQuadrado);
		
		double areaRetangulo = Quadrilateros.area(5d,5d);
		System.out.println("Area do Retangulo é igual á: "+ areaRetangulo);
		
		double areaTrapezio = Quadrilateros.area(7,8,9);
		System.out.println("Area do Trapezio é igual á: "+ areaTrapezio);
		
		double areaLosango = Quadrilateros.area(5f,5f);
		System.out.println("Area do Losango é igual á: "+ areaLosango);

	}

}
