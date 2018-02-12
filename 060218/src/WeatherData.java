import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	// No subject ni observer, observable, notify out
	
	private ArrayList<Observer> obs;
	private float temperature;
	private float pressure;
	private float humidity;

	public WeatherData(){}
	
	public void register(Observer ob){
		obs.add(ob);
	}
	
	public void remove(Observer ob){
		int i = obs.indexOf(ob);
		if(i >= 0){
			obs.remove(i);
		}
	}
	
	public void notif(Observer ob){
		for(Observer obs : obs){
			obs.Update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged(){
		setChanged();
		notif();
	}
	
	public void setMeasurement(float temp, float hum, float press){
		this.temperature = temp;
		this.humidity = hum;
		this.pressure = press;
		
		measurementChanged();
	}
	public void Set(float temp, float humi, float press){
		this.temperature = temp;
		this.humidity = humi;
		this.pressure = press;
		measurementChanged();
	}
	
	public float getTemp(){
		return temperature;
	}
	
	public float getPres(){
		return pressure;
	}
	
	public float getHum(){
		return humidity;
	}
	
	public void setData(float temperature, float preassure, float humidity){
		this.temperature = temperature;
		this.pressure = preassure;
		this.humidity = humidity;
		measurementChanged();
	}

	public void register() {
		
	}

	public void remove() {
		
	}

	public void notif() {
		
	}

	public ArrayList<Observer> getObs() {
		return obs;
	}

	public void setObs(ArrayList<Observer> obs) {
		this.obs = obs;
	}
	
	
	
}