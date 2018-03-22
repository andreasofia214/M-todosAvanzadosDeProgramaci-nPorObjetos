
public class MediumCommand implements Command{
	
	CeilingFan fan;
	int prevSpeed;
	
	public MediumCommand(CeilingFan fan){
		this.fan = fan;
	}
	
	public void execute() {
		prevSpeed=fan.getSpeed();
		fan.MEDIUM();
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