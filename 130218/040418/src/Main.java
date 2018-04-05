
public class Main {
	
	public static void main(String[] args){
		Amplifier amp = new Amplifier("Amplificador");
		Tuner tuner = new Tuner("AM/FM ", amp);
		DVDPlayer dvd = new DVDPlayer("Reproductor de DVD", amp);
		CDPlayer cd = new CDPlayer("Reproductor de CD", amp);
		Proyector proyector = new Proyector("Proyector", dvd);
		Luces luces = new Luces("Luces");
		Pantalla pantalla = new Pantalla("Pantalla");
		PopCorn popcorn = new PopCorn("Palomitas");
		Silla silla = new Silla("Silla reclinable");
		
		Facade hometheater = new Facade(amp, tuner, dvd, cd, pantalla, proyector, luces, popcorn, silla);
		
		hometheater.Netflix("Harry Potter: Las reliquias de la muerte Parte I");
		hometheater.End();
	}

}
