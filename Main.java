import java.util.Scanner;

public class Main{
	public static void main (String [] args){
		Scanner sc =new Scanner(System.in;
		int opc=0;
		do{
			verMenu();
			System.out.println("introduzca una opcion");
			opc=Integer.parseInt(sc.nextLine());
			switch (opc){
			case 1:
				break;
			case 2:
				break;
				
			case 3:
				break;
			case 4:
				default:
					System.out.println("ha elegido salir");
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