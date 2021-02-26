package mundo.herencia;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("======================================================\n");
		System.out.print("                NOTAS DEL ESTUDIANTE                  \n");
		System.out.print("======================================================\n");
		
		Notas est = new Notas("Armando", "Velasquez", "DDF45E666", 0);
		est.ingresarDatos();
		
		est.datosEst();
		
		est.promedio();  //No me da el promedio y ya es tarde :c
		
		System.out.print("======================================================\n");
	}	
}
