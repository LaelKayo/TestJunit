package questao01;


public class Fatorial {
	 public static int CalcFatorial(int numero) {
	        int i = 1;
	        int resultado = 1;
	        while (i <= numero) {
	            resultado = resultado * i;
	            i++;
	        }
	        return resultado;
	    }
}
