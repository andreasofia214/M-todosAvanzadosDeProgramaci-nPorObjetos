
public class SP {
	
	public Pizza Create(String tipo){
		Pizza pizza = null;
		
		if(tipo.equals("Pepperoni")){
			pizza = new Pepperoni();
		}
		else if(tipo.equals("Margarita")){
			pizza = new Margarita();
		}
		
		return pizza;
		
	}
	

}
