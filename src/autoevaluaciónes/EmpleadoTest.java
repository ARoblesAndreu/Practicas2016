package autoevaluaciónes;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {
	PuestoTrabajo puesto = new PuestoTrabajo("Administrador");
	Empleado emp = new Empleado("John Cost",10500,42,puesto);
	Empleado emp2 = new Empleado("John Cost",10500,42,puesto);
	
	@Test
	public void testHashCode() {
		System.out.println(emp2.hashCode());
		assertEquals(emp2.hashCode(),-114698719);
	}

	@Test
	public void testEmpleadoStringIntIntPuestoTrabajo() {
		Empleado constr = new Empleado();
		assertNotNull(constr);
	}

	@Test
	public void testEmpleado() {
		Empleado constr = new Empleado();
		assertNotNull(constr);
	}

	@Test
	public void testEmpleadoEmpleado() {
		Empleado constr = new Empleado();
		assertNotNull(constr);
	}

	@Test
	public void testGetNombre() {
		Empleado pruebaGet = new Empleado("John Cost",10500,42,new PuestoTrabajo());
		assertEquals("John Cost", pruebaGet.getNombre());
	}

	@Test
	public void testSetNombre() {
		Empleado pruebaSet = new Empleado();
		pruebaSet.setNombre("John Cost");
		assertEquals("John Cost",pruebaSet.getNombre());
	}

	@Test
	public void testGetSueldo() {
		Empleado pruebaGet = new Empleado("John Cost",10500,42,new PuestoTrabajo());
		assertEquals(10500,pruebaGet.getSueldo());
	}

	@Test
	public void testSetSueldo() {
		Empleado pruebaSet = new Empleado();
		pruebaSet.setSueldo(10500);
		assertEquals(10500,pruebaSet.getSueldo());
	}

	@Test
	public void testGetEdad() {
		Empleado pruebaGet = new Empleado("John Cost",10500,42,new PuestoTrabajo());
		assertEquals(42,pruebaGet.getEdad());
	}

	@Test
	public void testSetEdad() {
		Empleado pruebaSet = new Empleado();
		pruebaSet.setEdad(42);
		assertEquals(42,pruebaSet.getEdad());
	}

	@Test
	public void testGetPuesto() {
		PuestoTrabajo posicion = new PuestoTrabajo();
		Empleado pruebaGet = new Empleado("John Cost",10500,42,posicion);
		assertEquals(posicion,pruebaGet.getPuesto());
	}

	@Test
	public void testSetPuesto() {
		PuestoTrabajo posicion = new PuestoTrabajo();
		Empleado pruebaSet = new Empleado();
		pruebaSet.setPuesto(posicion);
		assertEquals(posicion,pruebaSet.getPuesto());
	}

	@Test
	public void testEqualsObject() {
		assertTrue(emp.equals(emp2));
	}

	@Test
	public void testToString() {
		Empleado pruebaString = new Empleado();
		assertEquals(pruebaString.toString(),"Empleado -> Nombre 'Jhon Cost', Sueldo '10500', Edad '42', Puesto 'Administrador'."
);
	}

}
