/**Ejercicio2.java
 * Programa que utiliza arrays de numeros enteros
 * Y comprueba si son iguales
 * Alvaro Robles Andreu 5-12-2016
 */

package practica4;
import java.util.Scanner;
public class BuscarInt {
	public static void main (String[] argumentos){
	int[] elementos = {1,4,7,9,6,8,4,2,3};
	Scanner teclado = new Scanner(System.in);
	int numero = 0;
	System.out.println("Introduzca el numero que quiere buscar");
	numero = teclado.nextInt();
	System.out.println("Resultado: "+maximoIntConsecutivos(elementos , numero));
	teclado.close();
	}//main
	public static int maximoIntConsecutivos(int[] elementos, int numero){
		int resultado = 0;
		for(int i = 0; i < elementos.length;i++){
			if (elementos[i] == numero){
				resultado = i;
				break;
				}//if
		}//for
		return resultado;
	}//vectoresIntIguales
}//class