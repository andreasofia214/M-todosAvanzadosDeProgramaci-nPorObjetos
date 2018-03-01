
public class Main {

	public static void main(String[] args){
		Banco b1 = new Banco1();
		Banco b2 = new Banco2();
		Banco b3 = new Banco3();
		
		String usuario1 = b1.update("usuario1", "usuario2", "html");
		String usuario2 = b2.update("usuario2", "usuario3", "mail");
		String usuario3 = b3.update("usuario3", "usuario1", "dunno");
		
		System.out.println("Usuario 1: " + usuario1);
		System.out.println("Usuario 2: " + usuario2);
		System.out.println("Usuario 3: " + usuario3);
		
	}


}
