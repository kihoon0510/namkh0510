package intern.no03;

public class InstanceCount {

	//static 변수를 선언하여 모든 객체에서 공유되도록 함.
	static int count =0;
	public InstanceCount() {
		// TODO Auto-generated constructor stub
		count ++;
		System.out.println("현재 사용중인 인스턴스:"+count+"개");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		count --;
		System.out.println("객체 제거: 사용중인 객체:"+count);
		
	}
}
