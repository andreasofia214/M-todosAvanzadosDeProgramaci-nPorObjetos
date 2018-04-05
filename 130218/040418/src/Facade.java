
public class Facade {
	
	Amplifier amp;
	Tuner tuner;
	DVDPlayer dvd;
	CDPlayer cd;
	Pantalla pant;
	Proyector pro;
	Luces luc;
	PopCorn pop;
	Silla silla;
	
	public Facade(Amplifier amp, Tuner tuner, DVDPlayer dvd, CDPlayer cd, Pantalla pant, Proyector pro, Luces luc, PopCorn pop, Silla silla){
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.pant = pant;
		this.pro = pro;
		this.luc = luc;
		this.pop = pop;
		this.silla = silla;
	}
	
	public void Netflix(String pelicula){
		System.out.println("Netflix...");
		
		pop.on();
		pop.pop();
		luc.dim(50);
		pant.on();
		pro.on();
		pro.WideScreen();
		amp.on();
		amp.setDVD(dvd);
		amp.Surround();
		amp.Volumen(15);
		dvd.on();
		silla.reclinar(135);
		dvd.play(pelicula);
	}
	
	public void End(){
		System.out.println("Se termino la pelicula...");
		
		pop.off();
		luc.on();
		pant.off();
		pro.off();
		silla.sentado();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
	public void Disco(String title){
		System.out.println("Reproducir Disco....");
		
		luc.on();
		amp.on();
		amp.Volumen(30);
		amp.setCD(cd);
		amp.Surround();
		cd.on();
		cd.play(title);
	}
	
	public void EndCd(){
		System.out.println("Se termino el disco...");
		
		amp.off();
		amp.setCD(cd);
		cd.eject();
		cd.off();
	}
	
	public void Radio(double freq){
		System.out.println("Radio...");
		
		tuner.on();
		tuner.Frequency(freq);
		amp.on();
		amp.Volumen(15);
		amp.setTuner(tuner);
	}
	
	public void Terminar(){
		System.out.println("Apagando la radio...");
		
		tuner.off();
		amp.off();
	}
	
	public void TV(){
		System.out.println("TV normal...");
		
		pant.on();
		pro.on();
		amp.on();
		amp.Volumen(10);
		silla.reclinar(134);
	}
	
	public void Apagar(){
		System.out.println("Apagando la tv...");
		
		pant.off();
		amp.off();
		silla.sentado();
	}

}
