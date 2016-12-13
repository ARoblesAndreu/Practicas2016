/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * Y comprueba si son iguales
 * Alvaro Robles Andreu 5-12-2016
 */

package practica4;
public class MaximoIntConsecutivos {
	public static void main (String[] argumentos){
	int[] elementos = {1,2,7,9,6,8,4,2,3};
	System.out.println("Programa que compara los elementos de un array."
			+ "\nSi ningun elemento del array es consecutivo muestra: 1."
			+ "\nSi un elemento del array es consecutivo muestra: 2 "
			+ "\no el numero de elementos consecutivos que haya."
			+ "\nSi el programa da error muestra: 0");
	System.out.println("Resultado: "+maximoIntConsecutivos(elementos));
	}//main
	public static int maximoIntConsecutivos(int[] elementos){
		int variable = 0;
		int valor = 1;
		for(int i = 1; i < elementos.length;i++){
			if (elementos[i] == elementos[i -1]+ 1){
				valor++;
				variable = valor;
				}//if
		}//for
		return variable;
	}//vectoresIntIguales
}//class