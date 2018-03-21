import java.util.List;

public class OffCommand implements Command{
	
	List<HomeElectrics> hE;
	
	public OffCommand(List<HomeElectrics> hE){
		this.hE = hE;
	}
	
	public void execute(){
		for(HomeElectrics hE : hE){
			hE.off();
		}
	}
}
