
public class Campos{

	private Nombre ValidaNombre;
	private Apellido ValidaApellido;
	private Edad ValidaEdad;
	private Email ValidaEmail;
	private Telefono ValidaTelefono;
	
	public String Nombre(){
		return ValidaNombre.Valida();
	}
	
	public String Apellido(){
		return ValidaApellido.Valida();
	}
	
	public String Edad(){
		return ValidaEdad.Valida();
	}
	
	public String Email(){
		return ValidaEmail.Valida();
	}
	
	public String Telefono(){
		return ValidaTelefono.Valida();
	}
}
