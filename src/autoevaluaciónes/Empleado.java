package autoevaluaciónes;

public class Empleado {
	
	private String nombre;
	private int sueldo;
	private int edad;
	private PuestoTrabajo puesto;

	public static void main(String[] args){
		Empleado emp = new Empleado();
		Empleado emp2 = new Empleado();
		System.out.println(emp);
		System.out.println(emp2.hashCode());
	}
	
	//Constructores
	public Empleado(String nombre, int sueldo, int edad, PuestoTrabajo puesto) {
		setNombre(nombre);
		setSueldo(sueldo);
		setEdad(edad);
		setPuesto(puesto);
	}
	
	public Empleado() {
		this("Jhon Cost",10500,42,new PuestoTrabajo());
	}

	/**
	 * Constructor copia. Utiliza constructor convencional.
	 * @param emp
	 */
	public Empleado(Empleado emp) {
		this(emp.nombre, emp.sueldo, emp.edad, new PuestoTrabajo(emp.puesto));
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		assert nombre!=null && nombre.length()>0;
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		assert sueldo > 10000;
		this.sueldo = sueldo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		assert edad > 16 && edad < 65;
		this.edad = edad;
	}

	public PuestoTrabajo getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoTrabajo puesto) {
		this.puesto = puesto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		result = prime * result + sueldo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		if (sueldo != other.sueldo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado -> Nombre '" + nombre + "', Sueldo '" + sueldo + "', Edad '"
				+ edad + "', Puesto '" + puesto + "'.";
	}

}
