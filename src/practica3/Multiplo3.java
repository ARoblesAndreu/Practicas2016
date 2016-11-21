package practica3;
// Multiplo1.java
// Fecha: 14/10/2013
// Autor/a:.......
// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
public class Multiplo3 	{
	public static void main(String argumentos[]) {
		muestraMultiplos3(pideTope());}
	public static int pideTope(){
		String mensaje;
		int TOPE;
		Scanner teclado = new Scanner(System.in);
		mensaje = "Introduzca el mayor multiplo de 2 que quiere ver:";
		System.out.println(mensaje);
		TOPE = teclado.nextInt();
		teclado.close();
		return TOPE;
	}
	public static void muestraMultiplos3(int TOPE){ 
		// Declaración de variables
		
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		
	}
}