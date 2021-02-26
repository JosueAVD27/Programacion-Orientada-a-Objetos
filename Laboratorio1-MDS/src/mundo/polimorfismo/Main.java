package mundo.polimorfismo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Programador prog = new Programador();
		Analista anali = new Analista();
		AdministradosBD admin = new AdministradosBD();
		
		JOptionPane.showMessageDialog(null, "Aqui comienza Polimorfismo 'Overload'");
		
		prog.datos("Armando ","Velasquez");
		prog.sueldo(12, 400);
		prog.labores("Programar");
		
		anali.datos("Armando", "Velasquez", "Rio Verde");
		anali.sueldo(12, 400, 2000);
		anali.labores("programar", 4);
		
		admin.datos("Armando");
		admin.sueldo(500);
		admin.labores("Programador");
		
		ProgramadorOverride progO = new ProgramadorOverride();
		AnalistaOverride analiO = new AnalistaOverride();
		AdministradorOverride adminO = new AdministradorOverride();
		
		JOptionPane.showMessageDialog(null, "Aqui comienza Polimorfismo 'Override'");
		
		progO.datos("Josue");
		progO.sueldo(500);
		progO.labores("Programador");
		
		analiO.datos("Josue");
		analiO.sueldo(550);
		analiO.labores("Programador");
		
		adminO.datos("Josue");
		adminO.sueldo(1645);
		adminO.labores("Programador");
		
	}

}
