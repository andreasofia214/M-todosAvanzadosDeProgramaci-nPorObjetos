
import java.util.Observable;
import java.util.Observer;

public class Forecast implements Observer, Vista {
	
	private float PresActual = 29.9f;
	private float lastpres;
	
	public Forecast(Observable obser){
		obser.addObserver(this);
	}
	
	public void update(Observable obser, Object arg){
		if(obser instanceof WeatherData){
			WeatherData wd =(WeatherData)obser;
			lastpres=PresActual;
			PresActual = wd.getPres();
			vista();
		}
	}
	
	public void vista(){
		System.out.println("Datos: ");
		if(PresActual>lastpres){
			System.out.println("Mejorando");
		}
		else if (PresActual == lastpres){
			System.out.println("Sigue igual");
		}
		else if(PresActual < lastpres){
			System.out.println("Bajando");
		}
	}

}
