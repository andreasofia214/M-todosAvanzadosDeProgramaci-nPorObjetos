import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends FilterInputStream {
	
	public LowerInputStream(InputStream ns){
		super(ns);	 
	}
	
	public int read() throws IOException{
		int r = super.read();
		return (r == 1 ? r:Character.toLowerCase((char)r));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException{
		int res = super.read(b, offset, len);
		for(int i = offset; i < offset; i++){
			b[i]=(byte)Character.toLowerCase((char)b[i]);
			
		}
		return res;
	}

}
