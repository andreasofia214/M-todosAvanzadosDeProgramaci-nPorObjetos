import java.util.*;

public class WeatherData implements Subject {
	
	// No subject ni observer, observable, notify out
	
	private ArrayList<Observer> obs;
	private float temperature;
	private float pressure;
	private float humidity;

	public void measurementChanged(){
		notif();
	}
	
	public float getTemp(){
		return temperature;
	}
	
	public float getPres(){
		return pressure;
	}
	
	public float Hum(){
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
	
	public WeatherData(){
		obs = new ArrayList<Observer>();
	}
	
	public void register(Observer ob){
		obs.add(ob);
	}
	
	public void remove(Observer ob){
		obs.remove(ob);
	}
	
	public void notif(Observer ob){
		for(Observer obs : obs){
			obs.Update(temperature, humidity, pressure);
		}
	}
	
	
}