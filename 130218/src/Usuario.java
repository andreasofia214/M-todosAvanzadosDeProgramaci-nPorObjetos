
public class Usuario extends Package{
	
	public int usuario;
	public String carrier;
	
	public int getUsuario(){return usuario;}
	
	
	public String getCarrier(){return carrier;}
	
	public void setUsuario(int usuario, int tracking){
		this.usuario = usuario;
		this.tracking = tracking;
	}
	
	public void setCarrier(String carrier){
		this.carrier = carrier;
	}

}
