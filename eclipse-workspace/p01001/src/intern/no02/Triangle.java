package intern.no02;

public class Triangle extends Shape {
	private int lineA,h=0;
	private int b,c=0;
	private double angle =0.0d;
	private int area =0;
	
	public Triangle(int a, int h) {
		this.lineA = a;
		this.h = h;
	}
	
	public Triangle(int b, int c, int angle) {
		// TODO Auto-generated constructor stub
		this.b = b;
		this.c = c;
		this.angle = angle;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		if(lineA!=0 && h!=0) {
			area = (lineA*h)/2;
			return area;
		}else if(b != 0 && c != 0 && angle!=0){
			area = (int)(b*c*Math.sin(Math.toRadians(angle)))/2;
			return area;
		}
		return -1;
		
	}

}
