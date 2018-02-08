public class Show implements Observer, Vista{
	
	
	private float temperature;
	private float pressure;
	private float humidity;
	private Subject sub;
	
	public Show(Subject sub){
		this.setSub(sub);
		sub.register();
	}
	
	public void Update(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		vista();
	}
	
	public void vista(){
		System.out.println("Elementos: " + temperature + "C°, " + pressure + "de presión y " + humidity + "humedad");
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

}