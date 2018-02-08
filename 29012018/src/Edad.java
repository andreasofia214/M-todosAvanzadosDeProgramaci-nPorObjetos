
public class Edad implements Validacion {
	String ed = "123";
	String e = "[0-9]";
	
	public String Valida(){
		
		if(!(ed.matches(e)) && ed.length()>2){
			return ("Valor no valido o excede el espacio disponible");
		}
		else{
			return ("Valor valido");
		}
	}
}
