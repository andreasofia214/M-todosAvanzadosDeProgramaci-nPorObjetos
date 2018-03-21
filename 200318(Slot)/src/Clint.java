import java.util.ArrayList;
import java.util.List;

public class Clint {
	
	public static void main(String[] args){
		
		HomeElectrics ce = UniversalRemote.getActiveDevice();
		OnCommand onCommand = new OnCommand(ce);
		ButtonInvoker onButton = new ButtonInvoker(onCommand);
		onButton.click();
 
		Ligths ls = new Ligths();
		AC ac = new AC();
		List<HomeElectrics> all = new ArrayList<HomeElectrics>();
		all.add(ls);
		all.add(ac);
		OffCommand offAll = new OffCommand(all);
		ButtonInvoker offAllButton = new ButtonInvoker(offAll);
		offAllButton.click();
	}
}
