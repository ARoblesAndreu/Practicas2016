package practica3;
// Multiplo1.java
// Fecha: 14/10/2013
// Autor/a:.......
// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

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