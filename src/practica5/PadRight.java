package practica5;
/**
 * 
 * 
 *Alvaro Robles Andreu 1ºDAW 
 */

import java.util.Scanner;
//Encabezado de la clase principal del programa
public class PadRight {   
	//Operaciones que realiza el programa 
	public static void main(String argumentos[]) {
		Scanner tecladotexto = new Scanner(System.in);
		Scanner tecladochar = new Scanner(System.in);
		Scanner tecladolong = new Scanner(System.in);
		
		System.out.println("Introduzca el texto:");
		String texto = tecladotexto.nextLine();
		System.out.println("Introduzca el caracter:");
		String letras = tecladochar.nextLine();
		System.out.println("Introduzca el número:");
		int longitud = tecladolong.nextInt();
		char caracter = letras.charAt(0);
		
		padRight(texto,caracter,longitud);

	}//main
	static void padRight(String texto, char caracter, int longitud){
		StringBuilder s1 = new StringBuilder(texto);
		String juntacion = "";
		for(int i = 0;i < longitud; i++){
			juntacion += caracter;
		}
		
		System.out.println(s1.append(juntacion));

	}//padRight
}
