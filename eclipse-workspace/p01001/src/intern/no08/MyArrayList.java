package intern.no08;

public class MyArrayList<E> {
	private int arraySize=1;
	private Object[] oldlist = new Object[1];
	private Object[] newlist = new Object[arraySize];
	
	
	public boolean add(E elem) {
		oldlist[0] = elem;
		arraySize++;
		for(int i=0;i<arraySize;i++) {
			
		}
		return true;
	}
	
	public void remove(int index) {
		
	}
	
	public void remove(E elem) {
		
	}
	
	public void contains(E elem) {
		
	}
	
	public void isEmpty() {
		
	}
	
	public void indexOf(E elem) {
		
	}
	
	public int size() {
		int size = oldlist.length;
		return size;
	}
	
	public Object get(int index) {
		return oldlist[index];
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int listValue;
		listValue = (int) oldlist[0];
		
		return "["+listValue+"]";
	}
	
}
