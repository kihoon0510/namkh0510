package intern.no05;

public class RepeatSum {
	private int r;
	private double value;
	private final double origin;
	
	public RepeatSum(int r, double value) {
		// TODO Auto-generated constructor stub
		this.r = r;
		this.value = value;
		this.origin = value;
	}
	
	public double value() {
		for(int i=1;i<r;i++) {
			value = origin + value;
		}
		return value;

	}

}