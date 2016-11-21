package practica3;
/** TablaMultiplicar.java
 * Fecha: 21/11/2016
 * Autor: Alvaro Robles Andreu
 * Programa que muestra la tabla de multiplicar de un número leido por teclado
 * mientras que el resultado de l amultiplicacion no sea mayor a 15
 */

import java.util.Scanner;
public class TablaMultiplicar	{
	public static void main(String argumentos[]) {
		calcularMostrarTabla();}
	public static void calcularMostrarTabla(){
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		final int TOPE = 15 ; 				// Constante, el máximo valor del múltiplo
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo
		int numero;
		String mensaje;
		mensaje = "Este programa muestra la tabla de multiplicar del número que introduzca.";
		System.out.println(mensaje);
		mensaje = "Introduzca el número: ";
		System.out.println(mensaje);
		numero = teclado.nextInt();
		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de " +numero);
		while (mult <= TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * numero;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}
}