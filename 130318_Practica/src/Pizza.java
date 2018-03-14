import java.util.ArrayList;

abstract public class Pizza {
	
	String Nombre, masa, salsa;
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getNombre(){
		return Nombre;
	}
	
	public void Prepare(){
		System.out.println("Preparando " + Nombre);
	}
	
	public void Bake(){
		System.out.println("Horneando " + Nombre);
	}
	
	public void Cut(){
		System.out.println("Cortando " + Nombre);
	}
	
	public void Box(){
		System.out.println("Empaquetando " + Nombre);
	}
	
	public String toString(){
		StringBuffer disp = new StringBuffer();
		disp.append("---" + Nombre + "---\n");
		disp.append(masa + "\n");
		disp.append(toppings + "\n");
		
		for(String toppings : toppings){
			disp.append(toppings + "\n");
		}
		
		return disp.toString();
	}

}
