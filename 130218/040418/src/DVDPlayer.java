
public class DVDPlayer {
	
	String desc;
	int actual;
	Amplifier amplifier;
	String pelicula;
	
	public DVDPlayer(String desc, Amplifier amplifier){
		this.desc = desc;
		this.amplifier = amplifier;
	}
	
	public void on(){
		System.out.println(desc + " prendido");
	}
	
	public void off(){
		System.out.println(desc + " apagado");
	}
	
	public void eject(){
		pelicula = null;
		System.out.println(desc + " expulsado");
	}
	
	public void play(String pelicula){
		this.pelicula = pelicula;
		actual = 0;
		System.out.println(desc + " reproduciendo -" + pelicula + "\"" );
	}
	
	public void play(int track){
		if(pelicula == null){
			System.out.println(desc + " no se pudo reproducir" + actual + ", CD no insertado");
		}else{
			actual = track;
			System.out.println(desc + " reproduciendo " + actual);
		}
	}
	
	public void stop(){
		actual = 0;
		System.out.println(desc + " detenido");
	}
	
	public void pause(){
		System.out.println(desc + " pausado \"" + pelicula + "\"");
	}
	
	public String toString(){
		return desc;
	}
	
	public void Audio(){
		System.out.println(desc + " audio");
	}
	
	public void Surround(){
		System.out.println(desc + " surround");
	}

}
