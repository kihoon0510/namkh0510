package intern;

public class Round {
	private int[] arrayDouble = new int[15];
	private double d;
	private int i; 

	public Round(double d, int p) {
		// TODO Auto-generated constructor stub
		this.d = d;
	}
	
	public void getRound() {
		
	}
	public void inputArray() {
		i = (int)d;
		d = d-i;
		
		for(int j=0;j<15;j++) {
			d = d*10.0d;
			arrayDouble[j+1] = (int)d;
			if(arrayDouble[j+1] == 0) break;
		}
	}
	
}
