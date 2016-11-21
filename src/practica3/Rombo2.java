package practica3;
/** Rombo2.java
 * Fecha: 21/11/2016
 * Autor: Alvaro Robles Andreu
 * Crea un rombo de un numero de filas leido por teclado usando metodos
 * y encadenando el rombo en un solo String.
 */

import java.util.Scanner;
public class Rombo2 	{
	public static void main(String argumentos[]) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		String mensaje;
		mensaje = "Este programa crea una piramide segun el número que se introduzca.";
		System.out.println(mensaje);
		mensaje = "Introduzca el número: ";
		numero = teclado.nextInt();
		System.out.println(rombo(numero));}
	public static String rombo(int numero){
		String resultado = "";
		if (numero % 2 == 0){
			return "El número es Par. Este programa requiere números impares";
		}
	
		//bucle para filas
		for (int i = 1; i <= (numero / 2) + 1; i++) {
			//bucle para espacios
			for (int j = 0; j < (numero / 2) + 1 -i; j++) {
				resultado += (" ");
			}
		
			//bucle para asteriscos
			for (int k = 0; k < (i * 2) -1 ;k++) {
				resultado += ("*");
			}	
			resultado += ("\n");	
		}
		for (int i = (numero /2); i > 0; i--) {
			for (int j = (numero /2) -i ; j >= 0; j--) {
				resultado += (" ");
			}
			
			for (int k = (i * 2) -1; k > 0 ; k--){
				resultado += ("*");
			}
			resultado += ("\n");	
		}
		return resultado;
	}
}