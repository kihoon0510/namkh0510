package intern.no08;

public class MyArrayList<E> {

	private Object[] list;
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public boolean add(Object elem) {
		list[0] = elem;
		return true;
	}
	
	public void remove(int index) {
		
	}
	
	public void remove(Object elem) {
		
	}
	
	public void contains(Object elem) {
		
	}
	
	public void isEmpty() {
		
	}
	
	public void indexOf(Object elem) {
		
	}
	
	public void size() {
		
	}
	
	public void get(int index) {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String listValue;
		listValue = (String) list[0];
		
		return listValue;
	}
	
}
