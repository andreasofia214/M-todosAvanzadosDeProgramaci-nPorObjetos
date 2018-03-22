
public class FanOffCommand implements Command{
	
	CeilingFan fan;
	int prevSpeed;
	
	public FanOffCommand(CeilingFan fan){
		this.fan = fan;
	}
	
	public void execute() {
		prevSpeed=fan.getSpeed();
		fan.OFF();
	}
	
	public void undo(){
		switch(prevSpeed){
		case CeilingFan.High: fan.HIGH(); break;
		case CeilingFan.Medium: fan.MEDIUM(); break;
		case CeilingFan.Low: fan.LOW(); break;
		default: fan.OFF(); break;
		}
	}

}
