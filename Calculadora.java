package calcular;
public class Calculadora{
	public int sumar(int a, int b){
		return a+b;
	}
	public int multiplicar(int a,int b){
		return a*b;
	}
	public int resta(int a, int b){
		if (a>b){
			return a-b;
		}
		else {
			return b-a;
		}
	}
	
}