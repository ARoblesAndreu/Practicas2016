package practica5;
/**
 * 
 * 
 *Alvaro Robles Andreu 1ºDAW 
 */

import java.util.Scanner;
//Encabezado de la clase principal del programa
public class InvertirTexto {   
	//Operaciones que realiza el programa 
	public static void main(String argumentos[]) {	
		
		invertirTexto();

	}//main
	static void invertirTexto(){
		int num;
		Scanner teclado = new Scanner(System.in);
		String alderecho;
		
		Scanner tecladonum = new Scanner(System.in);
		do{	
		System.out.println("Introduzca la palabra a invertir: ");
		alderecho = teclado.nextLine();
		
		StringBuilder builder = new StringBuilder(alderecho);
		
		String alreves = builder.reverse().toString();
		System.out.println(alreves);
		
		System.out.println("Si quiere introducir otra palabra pulse 1.\nSi quiere cerrar el programa pulse 0");
		
		num = tecladonum.nextInt();
		if (num == 1){
			continue;
		}
		}while(num != 0);
	}//invertirTexto
}
