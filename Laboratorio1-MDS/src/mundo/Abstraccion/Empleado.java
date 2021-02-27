package mundo.Abstraccion;

/**
 * 
 * @author Jonathan Landa
 *
 */

public abstract class Empleado {

	private String nombre;
	private int horasTrabajadas;
	private double sueldoPorHora;
	protected boolean pagado; 

	// constructor

	public Empleado(String pNombre, int pHorasTrabajadas, double pSueldoPorHora) {
		nombre = pNombre;
		horasTrabajadas = pHorasTrabajadas;
		sueldoPorHora = pSueldoPorHora;
		pagado = false;

	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	// MetodoAbstracto
	public abstract double calcularSalario();

	//
	public boolean esPagado() {
		boolean sipagado = false;
		if (pagado == true)
			sipagado = true;
		return sipagado;
	}

	//
	public void marcarPagado() {
		pagado = true;
	}
}