package intern.no14;

import java.util.Stack;

public class BackToFront {
	private String[] s;
	Stack<String> ss = new Stack<String>();
	public BackToFront(String str) {
		// TODO Auto-generated constructor stub
		
		s = str.split(" ");
		for(int i =0;i<s.length;i++) {
			ss.push(s[i]);
		}
		while(!ss.isEmpty()) {
			String v = ss.pop();
			System.out.print(v+" ");
			
		}
		System.out.println("");
		
	}
}
