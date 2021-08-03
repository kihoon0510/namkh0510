package intern.no02;

public class Square extends Shape {
	
	private int x,y;
	private int area;
	
	
	public Square(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		area = x*y;
		return area;
	}

	
}
