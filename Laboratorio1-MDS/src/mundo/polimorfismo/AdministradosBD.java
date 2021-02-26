package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class AdministradosBD extends Informaticos{

	public void sueldo(double pagoH) {
		JOptionPane.showMessageDialog(null, "El pago es: " + pagoH); 
	}
	
	public void datos(String nom) {
		JOptionPane.showMessageDialog(null, "Nombre: " + nom); 
	}
	
	public void labores(String lab) {
		JOptionPane.showMessageDialog(null, "Soy estudiante aprendiendo a: " + lab);
	}
}
