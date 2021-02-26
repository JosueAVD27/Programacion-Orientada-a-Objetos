package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class Programador extends Informaticos {

	//Utilizamos el polimorfismo - sobrecarga - overload
	public void sueldo(int horas, double pagoH) {
		JOptionPane.showMessageDialog(null, "El pago es: " + horas * pagoH); 
	}
	
	public void datos(String nom, String ape) {
		JOptionPane.showMessageDialog(null, "Nombre: " + nom + "\nApellido: " + ape); 
	}
	
	public void labores(String lab) {
		JOptionPane.showMessageDialog(null, "Soy estudiante aprendiendo a: " + lab);
	}
}