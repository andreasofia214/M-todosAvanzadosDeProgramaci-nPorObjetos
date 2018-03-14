
public class PizzaStore {
	
	SP fact;
	
	public PizzaStore(SP fact){
		this.fact = fact;
	}
	
	public Pizza Order(String tipo){
		Pizza pizza;
		
		pizza = fact.Create(tipo);
		
		pizza.Prepare();
		pizza.Bake();
		pizza.Cut();
		pizza.Box();
		
		return pizza;
	}
	
	

}
