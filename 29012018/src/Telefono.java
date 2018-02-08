
public class Telefono implements Validacion {
	String tel = "123456789-01";
	String t = "[0-9]-";
	
	public String Valida(){
		
		if(!(tel.matches(t)) && tel.length()>10){
			return ("Valor no valido");
		}
		else{
			return ("Valor valido");
		}
		
	}
}