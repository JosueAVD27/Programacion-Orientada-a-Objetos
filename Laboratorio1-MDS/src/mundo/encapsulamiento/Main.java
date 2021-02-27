package mundo.encapsulamiento;

public class Main {

	public static void main(String[] args) {
		
		Alumno alum = new Alumno();
		
		alum.setnControl(12345);
		alum.nombre = "Armando";
		alum.nombre = "Velasquez";
		alum.setEmail("ajvelasquez4@espe.edu.ec");
		alum.verDatos();
		
		System.out.println("Acceder al numero de control: " + alum.getnControl() + " es privado");
	}

}
