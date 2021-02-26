package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class Analista extends Informaticos{

	//Polimirfismo con sobrecarga - overload
	public void sueldo(int horas, double pagoH, double incend) {
		JOptionPane.showMessageDialog(null, "El pago es: " + ((horas * pagoH) + incend)); 
	}
	
	public void datos(String nom, String ape, String dir) {
		JOptionPane.showMessageDialog(null, "Nombre: " + nom + "\nApellido: " + ape + "\nDireccion: " + dir); 
	}
	
	public void labores(String lab, int horas) {
		JOptionPane.showMessageDialog(null, "Soy estudiante aprendiendo a: " + lab + " " + horas + "Horas");
	}
}
