package intern.no13;

import java.util.ArrayList;

public class StringSort {
	
	

	private StringBuffer strBuffer = new StringBuffer();
	ArrayList<String> arrayString = new ArrayList<String>();
	
	public void append(String s) {
		this.arrayString.add(s);

	}
	
	public void show() {
		System.out.println(strBuffer.toString());
	}
	
	
	public void rSort() {
		for(int i=0;i<arrayString.size();i++) {
			String v = arrayString.get(i);
			for(int j=0; j<(70-v.length());j++) {
				strBuffer.append(" ");
			}
			strBuffer.append(v+"\n");
		}
	}
	
	public void cSort() {
		for(int i=0;i<arrayString.size();i++) {
			String v = arrayString.get(i);
			for(int j=0; j<(70-v.length())/2;j++) {
				strBuffer.append(" ");
			}
			strBuffer.append(v+"\n");
		}
	}
	
	public void lSort() {
		for(int i=0;i<arrayString.size();i++) {
			String v = arrayString.get(i);
			strBuffer.append(v);
			for(int j=0; j<(70-v.length());j++) {
				strBuffer.append(" ");
			}
			strBuffer.append("\n");
			
		}
	}
}
