
public class Character {

	private WeaponBehaviour HasWeapon;
	
	public String useWeapon(){
	
		return HasWeapon.useWeapon();
	
	}
	
	public void setWeaponBehaviour(WeaponBehaviour weapon){
		this.HasWeapon = weapon;
	}
	
//	public static void main(String[] args){
//		Queen reina = new Queen();
//		reina.useWeapon();
//		System.out.println(reina);
//		
//	}

}
