
public class DHL {
	
	private int tracking = 12345;
	private int usuario;
	public String carrier = "DHL";
	
	public int getTracking(){return tracking;}
	
	public int getUsuario(){return usuario;}
	
	public void Set(int tracking, int usuario){
		this.tracking = tracking;
		this.usuario = usuario;
	}

}
