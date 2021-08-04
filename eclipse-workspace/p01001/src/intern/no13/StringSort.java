package intern.no13;

import java.util.ArrayList;

public class StringSort {
	
	

	private StringBuffer str = new StringBuffer();
	ArrayList<String> as = new ArrayList<String>();
	
	public void append(String s) {
		this.as.add(s);

	}
	
	public void show() {
		System.out.println(str.toString());
	}
	
	
	public void rSort() {
		for(int i=0;i<as.size();i++) {
			String v = as.get(i);
			for(int j=0; j<(70-v.length());j++) {
				str.append(" ");
			}
			str.append(v+"\n");
		}
	}
	
	public void cSort() {
		for(int i=0;i<as.size();i++) {
			String v = as.get(i);
			for(int j=0; j<(70-v.length())/2;j++) {
				str.append(" ");
			}
			str.append(v+"\n");
		}
	}
	
	public void lSort() {
		for(int i=0;i<as.size();i++) {
			String v = as.get(i);
			str.append(v);
			for(int j=0; j<(70-v.length());j++) {
				str.append(" ");
			}
			str.append("\n");
			
		}
	}
}
