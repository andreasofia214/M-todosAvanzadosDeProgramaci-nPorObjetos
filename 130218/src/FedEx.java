
public class FedEx {
	
	private int tracking = 67890;
	private int usuario;
	public String carrier = "FedEx";
	
	public int getTracking(){return tracking;}
	
	public int getUsuario(){return usuario;}
	
	public void Set(int tracking, int usuario){
		this.tracking = tracking;
		this.usuario = usuario;
	}


}
