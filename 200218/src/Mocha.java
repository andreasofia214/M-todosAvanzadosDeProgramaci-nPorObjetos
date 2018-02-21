
public class Mocha extends Ingrediente{
	
	Bebida moc;
	 
	public Mocha(Bebida moc){
		this.moc = moc;
	}
	
	public int cost(){
		if(getSize == "chico"){
			return 10;
		}
		else if(getSize == "mediano"){
			return 15;
		}
		else if(getSize == "grande"){
			return 20;
		}
		return moc.cost() + 5;
	}
	
	public String getSize() {
		return moc.getSize();
	}
	
	public String getIngrediente(){
		return "mocha";
		
	}

}
