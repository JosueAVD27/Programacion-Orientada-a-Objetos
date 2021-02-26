package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class AdministradorOverride extends InformaticosOverride{

	@Override
	public void sueldo(double pago) {
		JOptionPane.showMessageDialog(null, "El pago de un administrador es: " + pago);
	}
	
	@Override
	public void datos(String nom) {	
		JOptionPane.showMessageDialog(null, "El Nombre del administrador es: " + nom);
	}
	
	@Override
	public void labores(String lab) {
		JOptionPane.showMessageDialog(null, "Su labor es: " + lab);
	}
}
