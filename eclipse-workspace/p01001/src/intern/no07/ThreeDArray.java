package intern.no07;

public class ThreeDArray {

	private int[] array;
	private int arraySize;
	private int oneD,twoD,threeD;
	private int point;
	
	
	public ThreeDArray(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.oneD = a+1;
		this.twoD = b+1;
		this.threeD = c+1;
		arraySize = oneD*twoD*threeD;
		this.array = new int[arraySize];
		
		
		threeD= oneD*twoD;
	}
	
	public boolean put(int a, int b, int c, int value) {
		boolean putResult = true;
		try {
			point = (a) + oneD*(b) + threeD*(c);
			array[point] = value;
		} catch (Exception e) {
			putResult = false;
		}
		return putResult;
		
		
	}
	
	public int get(int a,int b,int c) {
		point = (a) + oneD*(b) + threeD*(c);
		return array[point];
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<array.length;i++) {
			buffer.append(array[i]);
			if (!(i == array.length - 1)) {
				buffer.append(", ");
			}
			
		}
		
		return "[" + buffer + "]";
	}
}
