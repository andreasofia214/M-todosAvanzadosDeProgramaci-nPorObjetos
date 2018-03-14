
public class Pizzeria {
	
	public static void main(String[] args){
		
		Pizza pc = new PizzaCetys();
		//Pizza pp = new PizzaPlayas();
		//Pizza ppp = new PizzaPeperoni();
		
		pc.Tipo("cetys");
		
		System.out.println(pc.tipo + "\n" + "\n" + pc.Prep() + "\n" + pc.Bake() + "\n" + pc.Cut() + "\n" + pc.Box());
	}

}
