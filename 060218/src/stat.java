import java.util.Observable;
import java.util.Observer;

public class stat implements Observer, Vista{
	
	private float maxT = 0.0f;
	private float minT = 200;
	private float tempS = 0.0f;
	private int num;
	
	public stat(Observable obs){
		obs.addObserver(this);
	}
	
	public void update (Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData wd = (WeatherData)obs;
			float temp = wd.getTemp();
			tempS += temp;
			num++;
			
			if(temp > maxT){ maxT = temp;}
			if(temp<minT){minT = temp;}
			
			vista();
		}
	}
		

	public void vista() {
		System.out.println("Temperatura promedio / Maxima / Minima = " + (tempS/num) + "/" + maxT + "/" + minT);
		
	}

}
