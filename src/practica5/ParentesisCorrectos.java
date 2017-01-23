package practica5;
/**Esto es un comentario que no afecta al programa
 * Sirve para aclarar que hace este programa
 * 
 * Programa que muestra un mensaje por pantalla
 * Alvaro Robles Andreu 1ºDAW 
 */
import java.util.Scanner;
//Encabezado de la clase principal del programa
public class ParentesisCorrectos {   

	//Operaciones que realiza el programa 
	public static void main(String argumentos[]) {	
	Scanner teclado = new Scanner(System.in);	
		//Muestra un mensaje en la pantalla
		String aritmetica;
		System.out.println("Introduzca una expresión aritmetica para comprobar si sus parentesis estan bien cerrados: ");
		aritmetica = teclado.nextLine();
		
		parentesisCorrectos(aritmetica);
	}//main
	
	static boolean parentesisCorrectos(String aritmetica){
		boolean resultado = true;
		int contador = 0;
		for(int i = 0; i < aritmetica.length();i++){
			if (aritmetica.charAt(i) == '('){
				contador++;
			}//1º if
			if (aritmetica.charAt(i) == ')'){
				contador--;
			}//2º if
		}//for
		if (contador == 0){
			resultado = true;
			System.out.println("Los parentesis estan bien.");
		}else{
			resultado = false;
			System.out.println("Los parentesis estan mal.");
		}
		return resultado;
		
	}//parentesisCorrectos
}//Class
