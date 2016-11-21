package practica2;
import java.util.Scanner;

/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2013.09.19
 */

import java.util.Scanner;
public class Operadores
{
//Ejercicio 5
//Operadores que tiene java
//Operadores Aritmeticos
	  // + Suma
	  // - Resta y cambio de signo
	  // * Producto o multiplicación
	  // / Cociente o división
	  // % Módulo o resto de la división entera
//Operadores de asignación
	 // += Suma y asignación
	 // -= Resta y asignación
	 // *= Producto y asignación
	 // /= Cociente y asignación
	 // %= Módulo y asignación
//Operadores Relacionales
	// ==  Igual que...
	// !=  Distinto que...
    //  >  Mayor que...
	//  <  Menor que...
	//  >= Mayor o igual que...
	//  <= Menor o igual que...
//Operadores Lógicos
	// &  AND lógico
	// |  OR lógico
	// ^  OR exclusivo lógico
	// || OR en cortocircuito
	// && AND en cortocircuito
	// !  NOT unario lógico
	// ?: if-then-else ternario


	public static void main(String argumentos[])
	{
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