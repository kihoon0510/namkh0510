package intern.no15;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToCSV {
	
	private StringBuffer stringBuffer = new StringBuffer();
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		String save="";
		while(!save.equals(":wq")) {
			save = sc.next();
			arrayList.add(save);
		}
		System.out.println(arrayList);
		
	}
	
	public void convert() {
		int i=0;
		while(!arrayList.isEmpty()) {
			if(arrayList.get(i)=="CRLF") {
				arrayList.set(i, "\n");
			}
			stringBuffer.append(arrayList.get(i)+",");
			i++;
		}
		System.out.println(stringBuffer);
		
	}
	
	public void sprit() {
		 
	}
}
