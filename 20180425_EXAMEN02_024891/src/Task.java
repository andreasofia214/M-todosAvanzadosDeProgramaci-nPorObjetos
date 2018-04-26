import java.sql.Date;

public abstract class Task {
	
	public abstract String getTask();
	public abstract boolean update();
	public String Log(Date date, int id, Task task){
		return "Robot " + id + " realizo la tarea " + task + " fecha: " + date;}
	public int getId() {
		return 0;
	};

}
