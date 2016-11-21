package practica3;
/** Banner.java
  * Fecha: 21/11/2016
  * Autor: Alvaro Robles Andreu
  * Muestra por pantalla mis iniciales usando un metodo
  */
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