package modelo;

public abstract class Empleado {
	
	private String nombre;
	private int horasTrabajadas;
	private double sueldoPorHora;
	protected boolean pagado;
	
	public Empleado(String nombre, int horasTrabajadas, double sueldoPorHora) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
		this.pagado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	} 
	
	// MetodoAbstracto
	public abstract double calcularSalario();
	
	public boolean esPagado() {
		boolean sipagado = false;
		if (pagado == true)
			sipagado = true;
		return sipagado;
	}

	public void marcarPagado() {
		pagado = true;
	}
}
