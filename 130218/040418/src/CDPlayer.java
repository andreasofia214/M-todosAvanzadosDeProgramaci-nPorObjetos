
public class CDPlayer {
	
	String desc;
	int actual;
	Amplifier amplifier;
	String title;
	
	public CDPlayer(String desc, Amplifier amplifier){
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
		title = null;
		System.out.println(desc + " expulsado");
	}
	
	public void play(String title){
		this.title = title;
		actual = 0;
		System.out.println(desc + " reproduciendo -" + title + "\"" );
	}
	
	public void play(int track){
		if(title == null){
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
		System.out.println(desc + " pausado \"" + title + "\"");
	}
	
	public String toString(){
		return desc;
	}

}
