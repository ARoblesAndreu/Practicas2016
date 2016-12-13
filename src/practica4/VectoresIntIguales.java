/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * Y comprueba si son iguales
 * Alvaro Robles Andreu 5-12-2016
 */

package practica4;
public class VectoresIntIguales {
	public static void main (String[] argumentos){
	int[] elementos = {1,5,1,6,5,1,3,5,7,4,3,5,4,1
					  ,9,8,1,6,5,4,8,1,9,6,0,1,9,8
					  ,7,4,9,6,1,9,1,9,8,8,6,6,5,7};
	int [] vector = {1,5,1,6,5,1,3,5,7,4,3,5,4,1
					,9,8,1,6,5,4,8,1,9,6,0,1,9,8
					,7,4,9,6,1,9,1,9,8,8,6,6,5,7};
	System.out.println("¿Los dos vectores son iguales?: "
					+vectoresIntIguales(vector, elementos));
	}//main
	public static boolean vectoresIntIguales(int[] vector, int[] elementos){
		boolean variable = false;
		if (elementos.length != vector.length){
			variable = false;
		}//primer if
		if (elementos.length == vector.length){
			for(int i = 0; i < elementos.length; i++){
				if (vector[i] == elementos[i]){
					variable = true;
				}//if anidado
			}//for
		}//segundo if
		return variable;
	}//vectoresIntIguales
}//class