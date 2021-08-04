package intern.no02;

public class Triangle extends Shape {
	private int lengthOfTheBottom,height=0;
	private int lengthOfOneSideA,lengthOfOneSideB=0;
	private double angle =0.0d;
	private int area =0;
	
	public Triangle(int a, int h) {
		this.lengthOfTheBottom = a;
		this.height = h;
	}
	
	public Triangle(int b, int c, int angle) {
		// TODO Auto-generated constructor stub
		this.lengthOfOneSideA = b;
		this.lengthOfOneSideB = c;
		this.angle = angle;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		if(lengthOfTheBottom!=0 && height!=0) {
			area = (lengthOfTheBottom*height)/2;
			return area;
		}else if(lengthOfOneSideA != 0 && lengthOfOneSideB != 0 && angle!=0){
			area = (int)(lengthOfOneSideA*lengthOfOneSideB*Math.sin(Math.toRadians(angle)))/2;
			return area;
		}
		return -1;
		
	}

}
