package intern.no06;

public class Round {
	private double doubleValue;
	private int point,value;
	
	
	public Round(double d, int point) {
		// TODO Auto-generated constructor stub
		this.doubleValue = d;
		this.point = point;
	}
	
	public void getValue() {
		if(point>0) {
			for(int i=0;i<point;i++) {
				doubleValue=doubleValue/10;
			}
			value = (int)((doubleValue%1)*10);
			if(value>4) {
				doubleValue+=1;
				doubleValue=(int)doubleValue;
			}else {
				doubleValue=(int)doubleValue;
			}
			for(int i=0;i<point;i++) {
				doubleValue=doubleValue*10;
			}
		}else if(point<0) {
			point = point*-1;
			for(int i=0;i<point;i++) {
				doubleValue=doubleValue*10;
			}
			value=(int)(doubleValue%10);
			if(value>4) {
				doubleValue+=10;
				doubleValue=doubleValue/10;
				doubleValue=(int)doubleValue;
			}else {
				doubleValue=doubleValue/10;
				doubleValue=(int)doubleValue;
			}
			for(int i=1;i<point;i++) {
				doubleValue=doubleValue/10;
			}
		}
		
		System.out.println("p: "+point+"자리수의 반올림 값:"+doubleValue);
		
	}
	
}
