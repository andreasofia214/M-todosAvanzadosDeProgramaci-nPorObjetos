
public class PizzaPeperoni extends Pizza{
	
	public String Prep() {
		return "Se prepara con pepperoni";
	}

	public String Bake() {
		return "Se horneo en horno convencional";
	}
	
	public String Cut(){
		return "Se corta con cortador de pizza";
	}

	public String Box() {
		return "Se empaqueta en caja de cartón";
	}

	public String Tipo() {
		return null;
	}

	public String CreatePizza() {
		return "Creando pizza: " + tipo;
	}

}
