
public class Luces {
	
	String desc;
	
	public Luces(String desc){
		this.desc = desc;
	}
	
	public void on(){
		System.out.println(desc + " encendidas");
	}
	
	public void off(){
		System.out.println(desc + " apgadas");
	}
	
	public void dim(int nivel){
		System.out.println(desc + " atenuando a " + nivel + "%");
	}
	
	public String toString(){
		return desc;
	}

}
