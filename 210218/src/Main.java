import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class Main {
	public static void main(String[] args){
		
		 try{
			 
			 System.out.println("Original: " + (new FileInputStream("a.txt")) );
			 LowerInputStream ns = new LowerInputStream(new BufferedInputStream(new FileInputStream("a.txt")));
			 
			 while(ns.available() > 0){
				 char r = (char)ns.read();
				 
				 System.out.println("Minusculas: " + r);
			 }
			 ns.close();
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	}
}
