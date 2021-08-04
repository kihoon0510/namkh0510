package intern.no14;

import java.util.Stack;

public class BackToFront {
	private String[] strArray;
	Stack<String> stackString = new Stack<String>();
	public BackToFront(String str) {
		// TODO Auto-generated constructor stub
		
		strArray = str.split(" ");
		for(int i =0;i<strArray.length;i++) {
			stackString.push(strArray[i]);
		}
		while(!stackString.isEmpty()) {
			String v = stackString.pop();
			System.out.print(v+" ");
			
		}
		System.out.println("");
		
	}
}
