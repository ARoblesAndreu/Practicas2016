/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2013.09.19
 */

package practica2;
import java.util.Scanner;
public class Alfabeto {
	//Ejercicio 1
	//Los comentarios son ignorados por el compilador por lo tanto no son parte del lenguaje Java.
	
	//Alfabeto en Java: A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
	
	//Una sentencia es una orden que se le da al programa para realizar una tarea específica,
	//esta puede ser: mostrar un mensaje en la pantalla, declarar una variable
	//(para reservar espacio en memoria), inicializarla, llamar a una función, etc. 
	//Las sentencias acaban con ;
	

	public static void main(String argumentos[]) {
		// La siguiente línea establece un canal de entrada por teclado.
	    // Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
				
		int num ;				// variable numérica
		String nombre = "";		// variable de texto 
				
		// configura y muestra mensaje de bienvenida
		num = 1 ;
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Mi número de orden es el " + num + " por ser el primero.");

		// Pide nombre
		System.out.print("\nDíme tu nombre: ");
				
		nombre = teclado.nextLine();
				
		// muestra mensaje personalizado
		System.out.println("\nBienvenido a Java. \n" + nombre + ", espero que lo pases bien...");
				
		}
}


	


