package autoevaluaciónes;

public class PuestoTrabajo {

	private String texto;

	public PuestoTrabajo(String texto) {
		setTexto(texto);
	}
	
	public PuestoTrabajo() {
		this("Administrador");
	}

	public PuestoTrabajo(PuestoTrabajo puesto) {
		this(puesto.texto);
	}

	@Override
	public String toString() {
		return texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
			this.texto = texto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		PuestoTrabajo other = (PuestoTrabajo) obj;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
}


