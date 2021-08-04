package intern.no12;

public class StringFormat {
	
	private StringBuffer str = new StringBuffer();
	
	// 스트링버퍼를 통해 자원 절약
	public void append(String s) {
		str.append(" "+s);
	}
	
	public void show() {
		System.out.println(str.toString());
	}
}
