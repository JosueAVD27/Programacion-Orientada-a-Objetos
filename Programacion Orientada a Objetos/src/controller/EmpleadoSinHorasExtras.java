package controller;

import interfaces.Pagado;
import modelo.Empleado;

public class EmpleadoSinHorasExtras extends Empleado implements Pagado {
	
	//Constructor
	public EmpleadoSinHorasExtras(String pNombre, int pHorasTrabajadas, double pSueldoPorHora) {
		super(pNombre, pHorasTrabajadas, pSueldoPorHora);
	}
		
	//Metodo
	public double calcularSalario() {
		double total = 0.0;
		total = getHorasTrabajadas() * getSueldoPorHora();
		return total;
	}
		
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
