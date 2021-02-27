package mundo.encapsulamiento;

public class Alumno {
	/**
	 * Atributos
	 */
	private int nControl;
	private String email;
	public String nombre;
	public String apellido;
	/**
	 * Getters
	 */
	public int getnControl() {
		return nControl;
	}
	public String getEmail() {
		return email;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	/**
	 * Setters
	 */
	public void setnControl(int nControl) {
		this.nControl = nControl;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void verDatos() {
		System.out.println("N° de control: " + nControl);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Email: " + email);
	}
}
