package intern;

public class InstanceCount {

	static int count =0;
	public InstanceCount() {
		// TODO Auto-generated constructor stub
		count ++;
		System.out.println("현재 사용중인 인스턴스 :"+count+"개");
	}
}
