/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * Y comprueba si son iguales
 * Alvaro Robles Andreu 5-12-2016
 */

package practica4;
public class CompararVectoresChar {
	public static void main (String[] argumentos){
	char[] primero = {'a','b'};
	char[] segundo = {'a','b'};
	System.out.println("Programa que compara dos arrays de tipo char."
			+ "\nSi son exactamente iguales muestra: 0."
			+ "\nSi el primero es mayor que el segundo muestra: 1."
			+ "\nSi el segundo es mayor que el primero muestra: -1."
			+ "\nSi el programa da error muestra: 10");
	System.out.println("¿Los dos arrays son iguales?: "
					+compararVectoresChar(primero, segundo));
	}//main
	public static int compararVectoresChar(char[] primero, char[] segundo){
		int variable = 10;
		int longitud = 0;
		
		if (primero.length == segundo.length){
			longitud = primero.length;
		}else if (primero.length != segundo.length){
			longitud = Math.min (primero.length, segundo.length);
		}
		for(int i = 0; i < longitud; i++){
			char c= primero[i];
			char j= segundo[i];
			if (c == j){
				variable = 0;
			}else if
			(c <= j){
				variable = 1;
			}//if 
			else {
				variable = -1;
			}//if 
		}//for
		return variable;
	}//vectoresIntIguales
}//class