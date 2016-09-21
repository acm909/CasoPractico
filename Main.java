package calcular;
import java.util.Scanner;

public class Main{
	public static void main (String [] args){
		Calculadora cal=new Calculadora;
		Scanner sc =new Scanner(System.in;
		int n1,n2;
		int opc=0;
		do{
			verMenu();
			System.out.println("introduzca una opcion");
			try{
			opc=Integer.parseInt(sc.nextLine());
			switch (opc){
			case 1:
				System.out.println(introduzca un numero);
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("introduzca otro");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("La suma es: " +cal.sumar(n1,n2));
				break;
			case 2:
				System.out.println(introduzca un numero);
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("introduzca otro");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("La multiplicacion es: "+cal.multiplicar(n1,n2));
				
				break;
				
			case 3:
				System.out.println(introduzca un numero);
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("introduzca otro");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("la resta es: "	+cal.restar(n1,n2));
				break;
			case 4:
				default:
					System.out.println("ha elegido salir");
			}
			}catch(NumberFormatException ex){
				System.out.println("No se puede realizar la operacion compruebe ha intorducido numero enteros");
			}
			
			
		}while(opc!=0);
		
		
		
	}
	public static void verMenu(){
		System.out.println("1.-Sumar");
		System.out.println("2.-Multiplicar");
		System.out.println("3.-Dividir");
		System.out.println("4.-Salir");
	}
}