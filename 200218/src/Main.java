
public class Main {
	
	public static void main(String[] args){
		Bebida beb = new Cafe();
		beb = new Mocha(beb);
		beb = new Crema(beb);
		
		beb.getSize = "chico";
		
		System.out.println(beb.getSize + ", "  + beb.getIngrediente("mocha") + ", " + beb.getIngrediente("crema") + ", Total $" + beb.cost());
	}

}
