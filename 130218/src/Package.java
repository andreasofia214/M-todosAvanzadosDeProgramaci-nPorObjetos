//***************PRACTICA 3****************//
import java.util.Observable;

public class Package extends Observable {
	
	public int tracking;
	public int usuario;
	public String carrier;
	
	public Package(){}
	
	public void Aviso(){
		setChanged();
		notify();
	}
	
	public int getTracking(){return tracking;}
	
	public int getUsuario(){return usuario;}
	
	public String getCarrier(){return carrier;}
	
	public void set(int tracking, int usuario, String carrier){
		this.tracking = tracking;
		this.usuario = usuario;
		this.carrier = carrier;
		Aviso();
	}
	
	
}
