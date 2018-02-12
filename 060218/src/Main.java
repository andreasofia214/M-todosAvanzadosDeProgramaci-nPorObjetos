
public class Main {
	
	public void main(String[] args){
			WeatherData w = new WeatherData();
			Show sh = new Show(w);
			stat ss = new stat(w);
			Forecast f = new Forecast(w);
			
			w.setMeasurement(30.4f,  65,  80);
			w.setMeasurement(29.2f,  70,  82);
			w.setMeasurement(29.2f,  90,  78);
	}
}

