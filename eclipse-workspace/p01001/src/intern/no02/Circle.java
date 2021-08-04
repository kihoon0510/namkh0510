package intern.no02;

public class Circle extends Shape {
	
	int radius=0;
	int value =0;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.radius = r;
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		value = (int)Math.PI*radius*radius;
		
		return value;
	}

}
