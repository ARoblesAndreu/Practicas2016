/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * les da un valor y los muestra por pantalla
 * Alvaro Robles Andreu 5-12-2016
 */

package practica4;
public class FrecuenciaNumero {
	public static void main (String[] argumentos){
	int[] elementos = {1,5,1,6,5,1,3,5,7,4,3,5,4,1
					  ,9,8,1,6,5,4,8,1,9,6,0,1,9,8
					  ,7,4,9,6,1,9,1,9,8,8,6,6,5,7};
	int numero= 8;
	System.out.println("El número es 8 y las veces que este se repite el numero son: "
	+frecuenciaNumero(numero, elementos));
	}//main
	public static int frecuenciaNumero(int numero, int[] elementos){
		int frecuencia;
		
		frecuencia = 0;
		for(int i = 0; i < elementos.length; i++){
			if (numero == elementos[i]){
			frecuencia++;}
		}//for
		return frecuencia;
	}//frecuenciaNumero
}//class