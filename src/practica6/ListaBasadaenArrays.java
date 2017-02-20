package practica6;
/** Primer ejercicio de la Practica 6 basada en Listas
 * 	Alvaro Robles Andreu 16/02/2017
 */
import java.util.ArrayList;
import java.util.Vector;
import java.util.Date;

public class ListaBasadaenArrays {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("Hola");
		list1.add(5);
		list1.add(3.14159);
		list1.add(new Date());
		System.out.println("ArrayList");
		for (int i = 0; i < list1.size(); i++) {
			Object valor = list1.get(i);
			System.out.format("Índice: %d; Valor: %s\n", i, valor);
		}
		Vector list2 = new Vector();
		list2.add("Hola");
		list2.add(5);
		list2.add(3.14159);
		list2.add(new Date());
		System.out.println("\nVector");
		for (int i = 0; i < list2.size(); i++) {
			Object valor = list2.get(i);
			System.out.format("Índice: %d; Valor: %s\n", i, valor);
		}
	}
}
