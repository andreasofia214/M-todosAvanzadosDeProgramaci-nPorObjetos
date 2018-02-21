
public class Cafe extends Bebida{
	
	public Cafe(){
		this.getSize = "chico";
		this.getSize = "mediano";
		this.getSize = "grande";
	}

	public int cost() {
		if (getSize.equals("chico")){
			return 10;
		}
		else if(getSize.equals("mediano")){
			return 15;
		}
		else if(getSize.equals("grande")){
			return 20;
		}
		return 0;
	}

	public String getIngrediente() {
		return "cafe puro";
	}

}
