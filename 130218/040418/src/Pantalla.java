
public class Pantalla {
	
	String desc;
	
	public Pantalla(String desc){
		this.desc = desc;
	}
	
	public void on(){
		System.out.println(desc + " prendida");
	}
	
	public void off(){
		System.out.println(desc + " apagada");
	}
	
	public String toString(){
		return desc;
	}

}
