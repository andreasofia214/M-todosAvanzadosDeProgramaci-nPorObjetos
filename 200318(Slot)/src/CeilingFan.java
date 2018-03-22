
public class CeilingFan{

	public static final int High= 3;
	public static final int Medium =2;
	public static final int Low = 1;
	public static final int Off = 0;
	
	String posicion;
	int speed;
	
	public CeilingFan(String posicion){
		this.posicion = posicion;
	}
	
	public void HIGH(){
		speed = High;
		System.out.println(posicion + " el ventilador esta en high");
	}
	
	public void MEDIUM(){
		speed = Medium;
		System.out.println(posicion + " el ventilador esta en medio");
	}
	
	public void LOW(){
		speed = Low;
		System.out.println(posicion + " el ventilador esta en Low");
	}
	
	public void OFF(){
		speed = Off;
		System.out.println(posicion + " el ventilador esta en off");
	}
	
	public int getSpeed(){
		return speed;
	}

}
