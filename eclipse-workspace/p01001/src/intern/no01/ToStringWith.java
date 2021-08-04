package intern.no01;

public class ToStringWith {

	String value;
	public ToStringWith(int x, int y) {
		this.value = "ToStringWith["+x+","+y+"]";
		
	
	}
	
	//toString을 오버라이드하여 해시값등을 제거.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
