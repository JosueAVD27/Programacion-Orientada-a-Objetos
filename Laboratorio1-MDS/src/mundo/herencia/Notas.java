package mundo.herencia;

import java.util.Scanner;

public class Notas extends Estudiante{
	/**
	 * Constantes
	 */
	public final static int TOTAL_EST = 5;
	
	/**
	 * Atributos
	 */
	private double notas[];
	
	/**
	 * Constructor
	 */

	public Notas(String pNombre, String pApellido, String pId, double pNotas) {
		super(pNombre, pApellido, pId);
		notas = new double [TOTAL_EST];
	}

	/**
	 * Datos Estudiante
	 */
	public void datosEst() {
		System.out.println("Nombre del estudiante: \n" + getNombre() + getApellido());
		System.out.println("Con ID: \n" + getId());
	}
	
	/**
	 * Ingresar notas
	 */
	
		public void ingresarDatos() {
			double var = 0.0;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingreso de notas: ");
			for (int i = 0; i < notas.length; i++) {
				do {		
					System.out.print("Notas [" + i + "]: ");
					var = entrada.nextDouble();
				}while(!(var >= 0 && var <= 5));
			notas[i] = var;
			}
		}
	
	/**
	 * Calcular el promedio
	 * @return
	 */
		public double promedio(){
			double suma = 0.0;
			int indice = 0;
			Scanner entrada = new Scanner(System.in);
			do {
				suma += notas[indice];
				indice++;
			}while(indice < TOTAL_EST);
			
			return suma/TOTAL_EST;
		}
}
