package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class ProgramadorOverride extends InformaticosOverride{
	
	@Override
	public void sueldo(double pago) {
		JOptionPane.showMessageDialog(null, "El pago de un programador es: " + pago);
	}
	
	@Override
	public void datos(String nom) {	
		JOptionPane.showMessageDialog(null, "El Nombre del programador es: " + nom);
	}
	
	@Override
	public void labores(String lab) {	
		JOptionPane.showMessageDialog(null, "Su labor es: " + lab);
	}
}
