
public class Amplifier {
	
	String desc;
	Tuner tuner;
	DVDPlayer dvd;
	CDPlayer cd;
	
	public Amplifier(String desc){
		this.desc = desc;
	}
	
	public void on(){
		System.out.println(desc + " prendido");
	}
	
	public void off(){
		System.out.println(desc + " apagado");
	}
	
	public void Stereo(){
		System.out.println(desc + " fijando modo stereo");
	}
	
	public void Surround(){
		System.out.println(desc + " fijando modo surround");
	}
	
	public void Volumen(int nivel){
		System.out.println(desc + " volumen en " + nivel);
	}
	
	public void setTuner(Tuner tuner){
		this.tuner = tuner;
		System.out.println(desc + " tuner a " + dvd);
	}
	
	public void setDVD(DVDPlayer dvd){
		this.dvd = dvd;
		System.out.println(desc + " dvd a " + dvd);
	}
	
	public void setCD(CDPlayer cd){
		this.cd = cd;
		System.out.print(desc + " cd a " + cd);
	}
	
	public String toString(){
		return desc;
	}

}
