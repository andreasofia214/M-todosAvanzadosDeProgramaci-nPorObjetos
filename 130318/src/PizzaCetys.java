
public class PizzaCetys extends Pizza {
	
	public String Prep() {
		return "Se prepar� con carne";
	}

	public String Bake() {
		return "Se hornea en horno de piedra";
	}

	public String Cut() {
		return "Se corta con cuchillo chef";
	}

	public String Box() {
		return "Se empaqueta en cajar de plastico(Reciclable)";
	}

	public String Tipo() {
		return null;
		 
	}
	public String CreatePizza() {
		return "Creando pizza: " + tipo;
	}

}
