package practica6;
/**
 * EjemploUsoCola.java
 * Imprementación del TDA Cola basada en un Array
 * Alvaro Robles Andreu - 09/03/2017
 */


import java.util.Queue;
import java.util.LinkedList;
	public class EjemploUsoCola {
		public static void main(String[] args) {
			Queue<String> mensajes = new LinkedList<String>();    
			mensajes.offer("Mensaje Uno");
			mensajes.offer("Mensaje Dos");
			mensajes.offer("Mensaje Tres");
			mensajes.offer("Mensaje Cuatro");
			 
			while (mensajes.size() > 0) {
			String msg = mensajes.poll();
			System.out.println(mensajes);
		}
	} 
}