
public class PizzaPlayas extends Pizza {

	public String Prep() {
		return "Se prepara con camarones";
	}

	public String Bake() {
		return "Se hornea al aire libre";
	}
	
	public String Cut(){
		return "Se corta con cuchillo chef";
	}

	public String Box() {
		return "Se empaqueta en cajas de papel-cartón";
	}

	public String Tipo() {
		return null;
	}

	public String CreatePizza() {
		return "Creando pizza: " + tipo;
	}
	
	
	
	
}
