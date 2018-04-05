
public class Silla {
	
	String desc;
	
	public Silla(String desc){
		this.desc = desc;
	}
	
	public void reclinar(int grados){
		System.out.println(desc + " reclinar a " + grados + " grados");
	}
	
	public void sentado(){
		System.out.println(desc + " modo sentado");
	}
	
	public String toString(){
		return desc;
	}

}
