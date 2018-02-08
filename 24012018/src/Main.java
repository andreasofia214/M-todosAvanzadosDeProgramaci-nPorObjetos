
public class Main {
	
	public static void main(String[] args){
		
		Queen reina = new Queen();
		System.out.println(reina.useWeapon());
		
		Knight caballero = new Knight();
		System.out.println(caballero.useWeapon());
		
		King rey = new King();
		System.out.println(rey.useWeapon());
		
		Troll orco = new Troll();
		System.out.println(orco.useWeapon());
	}

}
