
public class Pizzeria1 {
	
	public static void main(String[] args){
		
		SP factory = new SP();
		PizzaStore pizzeria = new PizzaStore(factory);
		
		Pizza pizza = pizzeria.Order("Pepperoni");
		
		System.out.println("Ordeno una pizza: " + pizza.getNombre() + "\n");
		System.out.println(pizza);
	}

}
