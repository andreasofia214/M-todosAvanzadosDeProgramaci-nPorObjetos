
public class Email implements Validacion {
	String email = "asdasfjkasf@asasfasf.com";
	String m = "[A-Z][a-z] @ .";
	
	public String Valida(){
		
		if(email.matches(m)){
			return ("Valor valido");
		}
		else{
			return ("Valor no valido");
		}
	}
}