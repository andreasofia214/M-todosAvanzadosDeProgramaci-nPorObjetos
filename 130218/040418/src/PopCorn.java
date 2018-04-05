
public class PopCorn {
	
	String desc;
	
	public PopCorn(String desc){
		this.desc = desc;
	}
	
	public void on(){
		System.out.println(desc + " prendido");
	}
	
	public void off(){
		System.out.println(desc + " apagado");
	}
	
	public void pop(){
		System.out.println(desc + " haciendo palomitas");
	}
	
	public String toString(){
		return desc;
	}

}
