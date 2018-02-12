import java.util.Observable;
import java.util.Observer;

public class Show implements Observer, Vista{
	
	Observable obser;
	private float temperature;
	private float pressure;
	private float humidity;
	
	public Show(Observable obser){
		this.obser=obser;
		obser.addObserver(this);
	}
	
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData wd = (WeatherData)obs;
			this.temperature = wd.getTemp();
			this.pressure = wd.getPres();
			this.humidity = wd.getHum();
			
			vista();
		}
	}
	
	public void vista(){
		System.out.println("Datos: " + temperature + "F grados, " + pressure + " presion y " + humidity + " humedad");
	}
}