import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("serial")
public abstract class List implements Iterable<Task>, Serializable{

	private ArrayList<Task> task;
	
	public Task cook;
	public Task paint;
	public Task fix;
	public Task rescue;
	
	public List(ArrayList<Task> list) 
	{
		task = list;
	}
	
	public Iterator<Task> iterator() {
		return task.iterator();
	}
	
	public double getId(){
		int id = 0;
		
		for (int i = 0; i < task.size(); i++){
			id += task.get(i).getId();
		}
		return id;
	}
	
	public Task[] getArray(){
		return task.toArray(new Task[]{});
	}
	
	public Task Cocinar(){
		return cook;
	}
	
	public Task Pintar(){
		return paint;
	}
	
	public Task Reparar(){
		return fix;
	}
	
	public Task Rescatar(){
		return rescue;
	}
	
	public void setCook(Task cook){
		this.cook = cook;
		System.out.println("Cocinando");
	}
	
	public void setPaint(Task paint){
		this.paint = paint;
		System.out.print("Pintanto");
	}
	
	public void setFix(Task fix){
		this.fix = fix;
		System.out.println("Reparando");
	}
	
	public void setRescue(Task rescue){
		this.rescue = rescue;
		System.out.println("Rescatando");
	}
}

