
public class Nombre implements Validacion {
	String nom = "Carlos1";
	String n = "[A-Z][a-z]";
	
	public String Valida(){
		if(nom.matches(n)){
			return ("Valor valido");
		}
		else{
			return ("Valor no valido");
		}
		
	}


}
