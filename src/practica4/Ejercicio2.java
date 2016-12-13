/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * les da un valor y los muestra por pantalla
 * Alvaro Robles Andreu 5-12-2016
 */
package practica4;

public class Ejercicio2 {
	public static void main (String[] argumentos){
	int[] elementos = new int[20];
	
	System.out.println("Los elementos son:");
		
	for(int i = 0; i < elementos.length; i++){
		elementos[i]=i*5;
		System.out.println(elementos[i]);
		}//for
	}//main
}//class