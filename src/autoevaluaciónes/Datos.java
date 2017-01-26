package autoevaluaciónes;
/**
 * Clase que contiene un array de objetos de la clase Usuario
 * y métodos para las pruebas y manipulación del array.
 * @author ajp
 */
public class Datos {

	public static String texto = "0344556K,pepe0,López Pérez0,C/Luna "
			+ "27 30132 Murcia,pepe0@gmail.com,"
			+ "1990.11.12,2015.12.3,miau0,usuario normal;"
			+ "0344556L,pepe1,López Pérez1,C/Sol "
			+ "28 30133 Murcia,pepe1@gmail.com,"
			+ "1990.11.12,2015.12.3,miau1,usuario normal;"
			+ "0344556M,pepe2,López Pérez2,C/Masa "
			+ "29 30134 Murcia,pepe0@gmail.com,"
			+ "1990.11.12,2015.12.3,miau2,usuario normal;"
			+ "0344556N,pepe3,López Pérez3,C/DVI "
			+ "30 30135 Murcia,pepe3@gmail.com,"
			+ "1990.11.12,2015.12.3,miau3,usuario normal;"
			+ "0344556O,pepe4,López Pérez4,C/SOA "
			+ "30 30136 Murcia,pepe4@gmail.com,"
			+ "1990.11.12,2015.12.3,miau4,usuario normal;";
	// Vector de objetos
	public static Usuario[] datosUsuarios;

	/**
	 * Método principal que coordina la llamada a los distintos métodos
	 * probados.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Prepara texto para la prueba con una cantidad arbitraria de objetos
		// Usuario
		// Cada objeto va separado por: ;
		// Los atributos van separados por: ,

		// ...

		// Llamada al método de importación de usuarios
		importarUsuariosTexto(texto);

		// ...

	}// main

	// Otros métodos...
	public static void importarUsuariosTexto(String datosTexto) {
	/** Metodo que separa e importa los datos de los usuarios y
	 * 	los introduce dentro de datosUsuarios[]
	 * @author Alvaro Robles Andreu
	 */
		// Creamos el array usuariosTexto y le introducimos el split
		String[] usuariosTexto = datosTexto.split(";");

		// iniciamos el array datosUsuarios y le asignamos su longitud
		datosUsuarios = new Usuario[usuariosTexto.length + 20];

		// hacemos un bucle para que recorra el array usuariosTexto
		for (int i = 0; i < usuariosTexto.length; i++) {
			// Partimos el array usuariosTexto por las comas y el resultado lo
			// guardamos en otro array
			String[] temporal = usuariosTexto[i].split(",");
			datosUsuarios[i] = new Usuario();
			datosUsuarios[i].nif = temporal[0];
			datosUsuarios[i].nombre = temporal[1];
			datosUsuarios[i].apellidos = temporal[2];
			datosUsuarios[i].domicilio = temporal[3];
			datosUsuarios[i].correo = temporal[4];
			datosUsuarios[i].fechaNacimiento = temporal[5];
			datosUsuarios[i].fechaAlta = temporal[6];
			datosUsuarios[i].claveAcceso = temporal[7];
			datosUsuarios[i].rol = temporal[8];
		}// for
	}// importarUsuariosTexto
} // class

/**
 * Clase que representa el usuario de un sistema.
 * 
 * @author ajp
 */
class Usuario {

	// Atributos
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correo;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

} // class