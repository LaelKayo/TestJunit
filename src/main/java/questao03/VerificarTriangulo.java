package questao03;

public class VerificarTriangulo {

	public static Boolean verificarTriangulo(int a, int b, int c) {
		if (a < b + c && b < a + c && c < a+b){
			return true;
		}
		return false;
	}
	
	public static String classificacaoDoTriangulo(int a, int b, int c) {
		if(verificarTriangulo(a,b,c)) {
			if (a == b && a == c){
				String reultado = "Triangulo Equilatero";
				return reultado;
			} else if(a == b || a == c || b ==c) {
				String reultado = "Triangulo Isosceles";
				return reultado;
			}else {
				String reultado = "Triangulo Escaleno";
				return reultado;
			}
		}else {
			String reultado = "Nao é triangulo";
			return reultado;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(verificarTriangulo(5, 6, 10));
		System.out.println(verificarTriangulo(5, 6, 20));
		System.out.println(classificacaoDoTriangulo(5, 6, 20));
		System.out.println(classificacaoDoTriangulo(6, 6, 6));
		System.out.println(classificacaoDoTriangulo(6, 6, 10));
		System.out.println(classificacaoDoTriangulo(6, 10, 6));
		System.out.println(classificacaoDoTriangulo(10, 6, 6));
		System.out.println(classificacaoDoTriangulo(6, 7, 8));
	}
}
