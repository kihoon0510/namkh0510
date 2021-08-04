package intern.no12;

public class StringFormat {
	
	private StringBuffer str = new StringBuffer();
	
	// 스트링버퍼 사용 
	public void append(String s) {
		str.append(" "+s);
	}
	
	public void show() {
		System.out.println(str.toString());
	}
}
