package mundo.herencia;

public class Estudiante {
	/**
	 * Atributos
	 */
	protected String nombre;
	protected String apellido;
	protected String id;
	
	/**
	 * Constructor
	 */
	public Estudiante(String pNombre, String pApellido, String pId) {
		nombre = pNombre;
		apellido = pApellido;
		id = pId;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getId() {
		return id;
	}
}
