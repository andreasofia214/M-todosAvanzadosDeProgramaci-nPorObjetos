
public class Tuner {
	
	String desc;
	Amplifier amplifier;
	double freq;
	
	public Tuner(String desc, Amplifier amplifier){
		this.desc = desc;
		this.amplifier = amplifier;
	}
	
	public void on(){
		System.out.println(desc + " prendido");
	}
	
	public void off(){
		System.out.println(desc + " apagado");
	}
	
	public void Frequency(double freq){
		System.out.println(desc + " fijando frecuencia en " + freq);
	}
	
	public void setAM(){
		System.out.println(desc + " fijando AM");
	}
	
	public void setFM(){
		System.out.println(desc + " fijando FM");
	}
	
	public String toString(){
		return desc;
	}

}
