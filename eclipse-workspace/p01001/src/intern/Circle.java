package intern;

public class Circle extends Shape {
	
	int r=0;
	int value =0;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		value = (int)Math.PI*r*r;
		
		return value;
	}

}
