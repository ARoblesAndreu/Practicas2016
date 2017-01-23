package practica3;
/** Piramide.java
 * Fecha: 21/11/2016
 * Autor: Alvaro Robles Andreu
 * Crea una piramide de un numero de filas leido por teclado usando metodos
 */


import java.util.Scanner;
public class Piramide 	{
	public static void main(String argumentos[]) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		String mensaje;
		mensaje = "Este programa crea una piramide segun el número que se introduzca.";
		System.out.println(mensaje);
		mensaje = "Introduzca el número: ";
		numero = teclado.nextInt();
		piramide(numero);
		teclado.close();
		}
	public static void piramide(int numero){
	
		//bucle para filas
		for (int i = 1; i <= numero; i++) {
			//bucle para espacios
			for (int j = 0; j < numero-i; j++) {
				System.out.print(" ");
			}
			//bucle para asteriscos
			for (int k = 0; k < (i * 2) -1 ;k++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
}