package autoevaluaciónes;
/** Principal.java
 * Fecha: 18/12/2016
 * Autor: Alvaro Robles Andreu
 * Clase Principal que carga datos de usuario en base a un array de enteros
 */
public class Autoevaluacion5CadenasdeCaracteres 	{
	final static int MAX_USUARIOS=45;
	static int[] enteros = {1,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1};
	
	//Almacén de datos resuelto con arrays
	
	public static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];
	
	static void cargarDatosUsuariosPatron(int[] enteros){
		Usuario usrAux = new Usuario();
		for(int i = 0; i < MAX_USUARIOS; i++){
			if (enteros[i%enteros.length] == 0){
					continue;
					}else{
			usrAux = new Usuario();
			usrAux.nif = i+"987654Y";
			usrAux.nombre = "Juan"+i;
			usrAux.apellidos = "Cuesta"+i;
			usrAux.domicilio = "C/ Desengaño 21"+i;
			usrAux.correo = "Juan"+i+"@gmail.com";
			usrAux.fechaNacimiento = "9.12.1957";
			usrAux.fechaAlta = "1.05.2016";
			usrAux.claveAcceso = "QueFollon"+i;
			usrAux.rol = "Presidente de esta nuestra comunidad";
			datosUsuarios[i] = usrAux;
			}
		}	
	}

	static void mostrarDatosUsuarios(){
		for(Usuario u: datosUsuarios){
		System.out.println("\n" +u);
		}
	}
	
	public static void main(String argumentos[]) {
		cargarDatosUsuariosPatron(enteros);
		mostrarDatosUsuarios();
	}//main
	
}//Principal
/**
 * Usuario.java
 * Clase con los Atributos de Usuario
 * Alvaro Robles Andreu - 18/12/2016
 */


 class Usuario {

    //Atributos
    public String nif;
    public String nombre;
    public String apellidos;
    public String correo;
    public String domicilio;
    public String fechaNacimiento;
    public String fechaAlta;
    public String claveAcceso;
    public String rol;

} //Usuario