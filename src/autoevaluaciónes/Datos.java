package autoevaluaciónes;
/** Principal.java
 * Fecha: 18/12/2016
 * Autor: Alvaro Robles Andreu
 * Clase Principal que carga datos de usuario en base a un array de enteros
 */
/**
 * Clase que contiene un array de objetos de la clase Usuario
 * y métodos para las pruebas y manipulación del array.
 * @author ajp
 */
public class Datos {

    // Vector de objetos
    public static Usuario[] datosUsuarios;

    /**
     * Método principal que coordina la
     * llamada a los distintos métodos probados.
     * @param args
     */
    public static void main(String[] args) {

        //Prepara texto para la prueba con una cantidad arbitraria de objetos Usuario
        //Cada objeto va separado por: ;
        //Los atributos van separados por: ,

        //...

        //Llamada al método de importación de usuarios

        //...

    }

    // Otros métodos...

} //class



/**
 * Clase que representa el usuario de un sistema.
 * @author ajp
 */
class Usuario {

    //Atributos
    public String nif;
    public String nombre;
    public String apellidos;
    public String domicilio;
    public String correo;
    public String fechaNacimiento;
    public String fechaAlta;
    public String claveAcceso;
    public String rol;

} //class