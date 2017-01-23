package practica3;
/** Rombo.java
 * Fecha: 21/11/2016
 * Autor: Alvaro Robles Andreu
 * Crea un rombo de un numero de filas leido por teclado usando metodos
 */

import java.util.Scanner;
public class Rombo 	{
	public static void main(String argumentos[]) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		String mensaje;
		mensaje = "Este programa crea una piramide segun el número que se introduzca.";
		System.out.println(mensaje);
		mensaje = "Introduzca el número: ";
		numero = teclado.nextInt();
		rombo(numero);
		teclado.close();
		}
	public static void rombo(int numero){
		
		if (numero % 2 == 0){
			System.out.println("El número es Par. Este programa requiere números impares");
			return;
		}
	
		//bucle para filas
		for (int i = 1; i <= (numero / 2) + 1; i++) {
			//bucle para espacios
			for (int j = 0; j < (numero / 2) + 1 -i; j++) {
				System.out.print(" ");
			}
		
			//bucle para asteriscos
			for (int k = 0; k < (i * 2) -1 ;k++) {
				System.out.print("*");
			}	
			System.out.print("\n");	
		}
		for (int i = (numero /2); i > 0; i--) {
			for (int j = (numero /2) -i ; j >= 0; j--) {
				System.out.print(" ");
			}
			
			for (int k = (i * 2) -1; k > 0 ; k--){
				System.out.print("*");
			}
			System.out.print("\n");	
		}	
	}
}