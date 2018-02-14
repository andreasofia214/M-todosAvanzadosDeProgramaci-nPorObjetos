import java.util.Scanner;

public class Main_P {
	
	public static void main(String[] args){
		
		Scanner a = new Scanner(System.in);
		Usuario user = new Usuario();
		Package tr = new Package();
		
		System.out.println("Regristrarse\n Usuario Id:");
		int us = a.nextInt();
		
		System.out.println("Ingresa numero de rastreo" );
		int track = a.nextInt();
		
		user.setUsuario(us, track);
		
		System.out.println("El paquete: " + track + " pertenece a " + us);
		
		
	}
	
	

}
