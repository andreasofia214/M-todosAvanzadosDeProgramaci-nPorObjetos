
public class Apellido implements Validacion{
	
	String ape = "Sanchez";
	String a = "[a-z][A-Z]";
	
	public String Valida(){
		
		if(ape.matches(a) && ape.length()<15){
			return ("Valor valido");
		}
		else{
			return ("Valor no valido");
		}
	}
			
}
