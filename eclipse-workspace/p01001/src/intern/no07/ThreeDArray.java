package intern.no07;

public class ThreeDArray {

	private int[] array;
	private int arraySize;
	private int as,bs,cs;
	private int point;
	
	
	public ThreeDArray(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.as = a;
		this.bs = b;
		this.cs = c;
		arraySize = as*bs*cs;
		this.array = new int[arraySize];
		
		
		cs= as*bs;
	}
	
	public void put(int a, int b, int c, int value) {
		point = (a-1) + as*(b-1) + cs*(c-1);
		array[point] = value;
		
		
	}
	
	public void get(int a,int b,int c) {
		point = (a-1) + as*(b-1) + cs*(c-1);
		System.out.println("��ǥ ("+a+","+b+","+c+") �� ��: "+array[point]);
	}
	
	public void showArray() {
		for(int i=0;i<arraySize;i++) {
			System.out.println(array[i]);
		}
	}
}