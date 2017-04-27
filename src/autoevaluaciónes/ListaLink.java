package autoevaluaciónes;

/**
 * Representa la implementación parcial de una lista enlazada simple en la que
 * se tiene acceso directo a los elementos primero.
 */
public class ListaLink{
	
	public static class PruebaListaLink{
		public static void main(String[] args){
			ListaLink lista = new ListaLink();
			lista.add("Hola");
			lista.add("Adios");
			System.out.println("Lista de Prueba: ");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				}
		}
	}
	
	/**
	 * La clase Nodo está anidada y representa la estructura de un elemento de
	 * la lista enlazada simple.
	 */
		class Nodo {

			// Atributos
			Object dato;
			Nodo siguiente;

			/**
			 * Constructor que inicializa atributos al valor por defecto.
			 */
			public Nodo(Object dato) {
			this.dato = dato;
			siguiente = null;
			}

		} // class Nodo

	// Atributos ListaLink
	private Nodo primero;
	private int numElementos;

	/**
	 * Constructor que inicializa los atributos al valor por defecto
	 */
	public ListaLink() {
		primero = null;
		numElementos = 0;
	}

	public void add(Object dato) {
		// variables auxiliares
		Nodo nuevo = new Nodo(dato);
		Nodo ultimo = null;

		if (numElementos == 0) {
			// Si la lista está vacía enlaza el nuevo nodo el primero.
			primero = nuevo;
		} else {
			// Obtiene el último nodo y enlaza el nuevo.
			ultimo = obtenerNodo(numElementos - 1);
			ultimo.siguiente = nuevo;
		}
		numElementos++;
	}// Actualiza el número de elementos.
	public Object get(int indice) {
		// lanza excepción si el índice no es válido
		   	 if (indice >= numElementos || indice < 0) {
		   		 throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
		   	 }
		Nodo aux = obtenerNodo(indice);
		   	return aux.dato;
		} 
	public int size() {
		return numElementos;
		}
	
	private Nodo obtenerNodo(int indice) {
		// Lanza excepción si el índice no es válido.
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);

		}

		// Recorre la lista hasta llegar al nodo de posición buscada.

		Nodo actual = primero;
		for (int i = 0; i < indice; i++)
			actual = actual.siguiente;
		return actual;

	}

} // class listaLink