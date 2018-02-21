
public class Crema extends Bebida{
	
	Bebida crem;
	 
	public Crema(Bebida crem){
		this.crem = crem;
	}
	
	public String getDescripcion(){
		return crem.getSize() + ", crema";
	}
	
	public int cost(){
		return 5 + crem.cost();
	}

	public String getIngrediente() {
		return "crema";
	}

}
