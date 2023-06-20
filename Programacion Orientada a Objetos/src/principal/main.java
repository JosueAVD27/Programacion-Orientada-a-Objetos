package principal;

import java.util.Scanner;

import controller.EmpleadoConHorasDobles;
import controller.EmpleadoConHorasTriples;
import controller.EmpleadoSinHorasExtras;

public class main {

	public static void main(String[] args) {

		int horasTrabajadas;
		double sueldoPorHora;
		String nombre;
		int horasExtra;
		char opcion; //usuario indique si ejecuta el proceso de pagar el empleado

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Sueldo por Hora: ");
		sueldoPorHora = entrada.nextDouble();
		System.out.print("Horas Trabajadas: ");
		horasTrabajadas = entrada.nextInt();
		entrada.nextLine();
		horasExtra = horasTrabajadas - 40;

		if (horasTrabajadas >0 && horasTrabajadas <= 40) {
			EmpleadoSinHorasExtras empleado1 = new EmpleadoSinHorasExtras(nombre, horasTrabajadas, sueldoPorHora);
			System.out.println("Nombre del empleado:" + empleado1.getNombre());
			System.out.println("Horas Trabajadas:" + empleado1.getHorasTrabajadas());
			System.out.println("Sueldo por Hora:" + empleado1.getSueldoPorHora());
			System.out.println("Saldo: " + empleado1.calcularSalario());
			System.out.println("Desea pagar Salario? <S/N>");
			opcion = entrada.next().charAt(0);
			if(opcion == 'S' ||opcion == 's') {
				empleado1.marcarPagado();
			}
			if(empleado1.esPagado()) {
				System.out.println("Empleado Pagado");
			} else {
				System.out.println("Empleado No Pagado");
			}
			
		} else if (horasTrabajadas >= 41 && horasTrabajadas <= 45) {
			EmpleadoConHorasDobles empleado2 = new EmpleadoConHorasDobles(nombre, horasTrabajadas, sueldoPorHora,
					horasExtra);
			System.out.println("Nombre del empleado:" + empleado2.getNombre());
			System.out.println("Horas Trabajadas:" + empleado2.getHorasTrabajadas());
			System.out.println("Sueldo por Hora:" + empleado2.getSueldoPorHora());
			System.out.println("Horas Extra: " + empleado2.getHorasExtras());
			System.out.println("Saldo: " + empleado2.calcularSalario());
		} else {
			EmpleadoConHorasTriples empleado3 = new EmpleadoConHorasTriples(nombre, horasTrabajadas, sueldoPorHora,
					horasExtra);
			System.out.println("Nombre del empleado:" + empleado3.getNombre());
			System.out.println("Horas Trabajadas:" + empleado3.getHorasTrabajadas());
			System.out.println("Sueldo por Hora:" + empleado3.getSueldoPorHora());
			System.out.println("Horas Extra: " + empleado3.getHorasExtras());
			System.out.println("Saldo: " + empleado3.calcularSalario());
		}
	}
}
