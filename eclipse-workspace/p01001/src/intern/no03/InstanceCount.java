package intern.no03;

public class InstanceCount {

	//static ������ �����Ͽ� ��� ��ü���� �����ǵ��� ��.
	static int count =0;
	public InstanceCount() {
		// TODO Auto-generated constructor stub
		count ++;
		System.out.println("���� ������� �ν��Ͻ� :"+count+"��");
	}
}
