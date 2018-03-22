
public class MacroCommand implements Command{
	
	Command[] com;
	
	public MacroCommand(Command[] com){
		this.com = com;
	}
	
	public void execute(){
		for(int i=0; i< com.length; i++){
			com[i].execute();
		}
	}
	
	public void undo(){
		for(int i = com.length -1; i>=0; i--){
			com[i].undo();
		}
	}

}
