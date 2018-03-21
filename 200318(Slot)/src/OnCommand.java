
public class OnCommand implements Command{
	
	private HomeElectrics hE;
	
	public OnCommand(HomeElectrics hE){
		this.hE = hE;
	}
	
	public void execute(){
		hE.on();
	}

}
