package intern.no07;

public class ThreeDArray {

	private int[] array;
	private int arraySize;
	private int oneD,twoD,cs;
	private int point;
	
	
	public ThreeDArray(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.oneD = a;
		this.twoD = b;
		this.cs = c;
		arraySize = oneD*twoD*cs;
		this.array = new int[arraySize];
		
		
		cs= oneD*twoD;
	}
	
	public void put(int a, int b, int c, int value) {
		point = (a-1) + oneD*(b-1) + cs*(c-1);
		array[point] = value;
		
		
	}
	
	public void get(int a,int b,int c) {
		point = (a-1) + oneD*(b-1) + cs*(c-1);
		System.out.println("좌표 ("+a+","+b+","+c+") 의 값: "+array[point]);
	}
	
	public void showArray() {
		for(int i=0;i<arraySize;i++) {
			System.out.println(array[i]);
		}
	}
}
