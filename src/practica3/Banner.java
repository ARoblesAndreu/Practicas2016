package practica3;
// Multiplo1.java
// Fecha: 14/10/2013
// Autor/a:.......
// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
public class Banner 	{
	public static void main(String argumentos[]) {
		banner();}
	public static String banner(){
		String iniciales ="    AAA    RRRRRR       AAA"
			    + "\n   A   A   R     R     A   A"
		    	+ "\n  A     A  R     R    A     A"
				+ "\n  AAAAAAA  RRRRRR     AAAAAAA"
				+ "\n  A     A  R    R     A     A"
				+ "\n  A     A  R     R    A     A"
				+ "\n  A     A  R      R   A     A" ;
		System.out.println(iniciales);
		return iniciales;
		
	}
}