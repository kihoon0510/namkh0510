package intern.no12;

public class StringFormat {
	
	private StringBuffer str = new StringBuffer();
	
	// ��Ʈ�����۸� ���� �ڿ� ����
	public void append(String s) {
		str.append(" "+s);
	}
	
	public void show() {
		System.out.println(str.toString());
	}
}
