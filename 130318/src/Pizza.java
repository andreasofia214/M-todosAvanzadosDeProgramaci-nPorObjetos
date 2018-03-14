
public abstract class Pizza extends PizzaStore{
	
	public String tipo;
	
	public abstract String Prep();
	public abstract String Bake();
	public abstract String Cut();
	public abstract String Box();
	public abstract String Tipo();
	
	public String Prep(String prep){
		return prep;
	}
	
	public String Bake(String bake){
		return bake;
	}
	
	public String Cut(String cut){
		return cut;
	}
	
	public String Box(String box){
		return box;
	}
	
	public String Tipo(String tipo){
		if(tipo.equals("cetys")){
			System.out.println("Pizza tipo Cetys");
		}else if(tipo.equals("playas")){
			System.out.println("Pizza tipo Playas");
		}else if(tipo.equals("pepperoni")){
			System.out.println("Pizza de Pepperoni");
		}
		return null;
	}
	

}
