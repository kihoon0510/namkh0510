package intern.no06;

public class Round {
	private double d;
	private int p,v;
	
	
	public Round(double d, int point) {
		// TODO Auto-generated constructor stub
		this.d = d;
		this.p = point;
	}
	
	public void getValue() {
		if(p>0) {
			for(int i=0;i<p;i++) {
				d=d/10;
			}
			v = (int)((d%1)*10);
			if(v>4) {
				d+=1;
				d=(int)d;
			}else {
				d=(int)d;
			}
			for(int i=0;i<p;i++) {
				d=d*10;
			}
		}else if(p<0) {
			p = p*-1;
			for(int i=0;i<p;i++) {
				d=d*10;
			}
			v=(int)(d%10);
			if(v>4) {
				d+=10;
				d=d/10;
				d=(int)d;
			}else {
				d=d/10;
				d=(int)d;
			}
			for(int i=1;i<p;i++) {
				d=d/10;
			}
		}
		
		System.out.println("p: "+p+"�ڸ����� �ݿø� ��:"+d);
		
	}
	
}