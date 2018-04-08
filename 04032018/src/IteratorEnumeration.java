

public class IteratorEnumeration implements Iterator{

	Enumeration enumeration;
	
	public IteratorEnumeration(Enumeration enumeration){
		this.enumeration = enumeration;
		
	}
	
	public boolean hasNext(){
		return enumeration.hasMoreElements();
	}
	
	public Object Next(){
		return enumeration.nextElement();
	}
	
	public void Remove(){
		throw new UnsupportedOperationException();
	}
}
