package intern.no05;

public class RepeatSum {
	private int repeatCount;
	private double value;
	private final double origin;
	
	public RepeatSum(int repeatCount, double value) {
		// TODO Auto-generated constructor stub
		this.repeatCount = repeatCount;
		this.value = value;
		this.origin = value;
	}
	
	public double value() {
		for(int i=1;i<repeatCount;i++) {
			value = origin + value;
		}
		return value;

	}

}
