package questao02;

public class Cubo {

	public static int AreaDeUmLado(int area) {
		int AL= area * area;
		return AL;
	}
	
	public static int AreaLateral(int area) {
		int AL= 4 * (area * area);
		return AL;
	}
	
	public static int AreaTotal(int area) {
		int AT= 6 * (area * area);
		return AT;
	}
	
	public static int Volume(int area) {
		int V= area * area * area;
		return V;
	}
}
