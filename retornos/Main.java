package retornos;

public class Main {

	public static void main(String[] args) {
		
		double areaQuadrado = Quadrilateros.area(5);
		System.out.println("Area do quadrado � igual �: "+ areaQuadrado);
		
		double areaRetangulo = Quadrilateros.area(5d,5d);
		System.out.println("Area do Retangulo � igual �: "+ areaRetangulo);
		
		double areaTrapezio = Quadrilateros.area(7,8,9);
		System.out.println("Area do Trapezio � igual �: "+ areaTrapezio);
		
		double areaLosango = Quadrilateros.area(5f,5f);
		System.out.println("Area do Losango � igual �: "+ areaLosango);

	}

}
