package mundo.Abstraccion;
/**
 * 
 * @author Jonathan Landa
 *
 */

public class EmpleadoConHorasTriples extends Empleado implements Pagado{

	private int horasExtras;
	
	//Constructor
	public EmpleadoConHorasTriples(String pNombre, int pHorasTrabajadas, double pSueldoPorHora, int pHorasExtras) {
		super(pNombre, pHorasTrabajadas, pSueldoPorHora);
		horasExtras = pHorasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	//Metodo
	public double calcularSalario() {
		double total = 0.0;
		int hotasT = getHorasTrabajadas() - getHorasExtras();
		total = ((hotasT * getSueldoPorHora()) + (getHorasExtras()) * (getSueldoPorHora()*3));		
		return total;
	}
	
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
