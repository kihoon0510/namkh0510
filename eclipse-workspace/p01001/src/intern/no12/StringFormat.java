package intern.no12;

public class StringFormat {
	
	private StringBuffer strBuffer = new StringBuffer();
	
	// 스트링버퍼 사용 
	public void append(String s) {
		strBuffer.append(" "+s);
	}
	
	public void show() {
		System.out.println(strBuffer.toString());
	}
}
