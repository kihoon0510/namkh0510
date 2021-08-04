package intern.no07;

public class ThreeDArray {

	private int[] array;
	private int arraySize;
	private int oneDimension,twoDimension,threeDimension;
	private int point;
	
	
	public ThreeDArray(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.oneDimension = a;
		this.twoDimension = b;
		this.threeDimension = c;
		arraySize = oneDimension*twoDimension*threeDimension;
		this.array = new int[arraySize];
		
		
		threeDimension= oneDimension*twoDimension;
	}
	
	public void put(int a, int b, int c, int value) {
		point = (a-1) + oneDimension*(b-1) + threeDimension*(c-1);
		array[point] = value;
		
		
	}
	
	public void get(int a,int b,int c) {
		point = (a-1) + oneDimension*(b-1) + threeDimension*(c-1);
		System.out.println("좌표 ("+a+","+b+","+c+") 의 값: "+array[point]);
	}
	
	public void showArray() {
		for(int i=0;i<arraySize;i++) {
			System.out.println(array[i]);
		}
	}
}
