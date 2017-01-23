package practica5;
/**Esto es un comentario que no afecta al programa
 * Sirve para aclarar que hace este programa
 * 
 * Programa que muestra un mensaje por pantalla
 * Alvaro Robles Andreu 1ºDAW 
 */
import java.util.Scanner;
//Encabezado de la clase principal del programa
public class ObtenerNumeroVecesSubCadena {   
	
	//Operaciones que realiza el programa 
	public static void main(String argumentos[]) {	
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		String sub;
		String cadena;
		System.out.println("Introduzca la cadena en la que quiere buscar: ");
		cadena = teclado2.nextLine();
		System.out.println("Introduzca la Subcadena que quiere buscar dentro de la anterior cadena: ");
		sub = teclado.nextLine();
    	System.out.println("Se han encontrado " +obtenerNumeroVecesSubCadena(cadena, sub) +" subcadenas");
    	
    	
	}//main
	static int obtenerNumeroVecesSubCadena(String cadena, String sub){
		int encontrados = 0;
		int ultimo = cadena.indexOf(sub);
		while(ultimo != -1){
		ultimo = cadena.indexOf(sub, ultimo+1);
		encontrados++;
		}//for
		System.out.println(encontrados);
		return encontrados;
	}//obtenerNumeroVecesSubCadena
}//Class
