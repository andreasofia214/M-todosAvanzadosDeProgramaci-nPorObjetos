import java.util.Date;

public class Robot extends Task {
	
	public int id = 0;
	public Task task;
	public boolean state;
	public Date data;
	
	public String getDate(){
		
		return data.toString(); 
	}
	
	
	public String getTask() {
		return "Robot " + id + " haciendo " + task; 
	}
	
	public int getId(){
		for (int i = 0; i < id; i++){
			id +=1;
			i = id;
		}
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public boolean update() {
		return state;
	}
	
}
