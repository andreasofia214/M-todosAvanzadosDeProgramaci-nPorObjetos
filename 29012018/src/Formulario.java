//import java.util.Scanner;

public class Formulario{
	
	public static void main(String[] args){
		
		Nombre name = new Nombre();
		System.out.println(name.Valida());
		
		Apellido last = new Apellido();
		System.out.println(last.Valida());
		
		Edad age = new Edad();
		System.out.println(age.Valida());
		
		Email mail = new Email();
		System.out.println(mail.Valida());
		
		Telefono phone = new Telefono();
		System.out.println(phone.Valida());
	}
}
