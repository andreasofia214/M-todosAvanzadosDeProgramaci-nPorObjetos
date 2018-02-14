import java.util.Observable;
import java.util.Observer;

public class Disp implements Observer, Show{
	
	Observable ob;
	private int tracking;
	private int usuario;
	private String carrier;
	
	public Disp(Observable ob) {
		this.ob = ob;
		ob.addObserver(this);		
		
	}

	public void update(Observable ob, Object arg) {
		if(ob instanceof Package){
			Package pack = (Package)ob;
			this.tracking = pack.getTracking();
			this.usuario = pack.getUsuario();
			this.carrier = pack.getCarrier();
			
			show();
		}
	}

	public void show() {
		System.out.print("Funcion");
		
	}
	
	
}
