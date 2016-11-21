/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class MayorMedioMenor
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		int mayor;
		int medio;
		int menor;
		int tmp;
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, Soy un programa de ordenador que lee 3 números y te da el mayor\n");
		
		//Pide el numero
		System.out.println("Introduce el primer número: ");
		
		mayor = teclado.nextInt();
		
		//Pide el numero 2
		System.out.println("Introduce el segundo número: ");
		
		tmp = teclado.nextInt();
		
		if (mayor < tmp) {
			medio = mayor;
			mayor = tmp;
		} else {
			medio = tmp;
		}
		
		//Pide el numero 3
		System.out.println("Introduce el tercer número: ");
		
	     tmp = teclado.nextInt();
	     
	     if (tmp > mayor) {
	    	 menor = medio;
	    	 medio = mayor;
	    	 mayor = tmp;
	     } else {
	    	 if (tmp > medio) {
	    	 	menor = medio;
	    	 	medio = tmp;
	     	 } else { 
	     		 menor = tmp;
	     	 }
	     }
	    System.out.println(" Los números ordenados son: " + mayor + "," + medio + "," + menor);
	}
}


