
public class Proyector {
	
	String desc;
	DVDPlayer dvd;
	
	public Proyector(String desc, DVDPlayer dvd){
		this.desc = desc;
		this.dvd = dvd;
	}
	
	public void on(){
		System.out.println(desc + " prendido");
	}
	
	public void off(){
		System.out.println(desc + " apagado");
	}
	
	public void WideScreen(){
		System.out.println(desc + " widescreen");
	}
	
	public void TV(){
		System.out.println(desc + " tv");
	}
	
	public String toString(){
		return desc;
	}

}
