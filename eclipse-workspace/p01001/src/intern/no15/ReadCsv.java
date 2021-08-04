package intern.no15;

public class ReadCsv {
	String[] sArray;
	String s;
	
	public void convert(String str) {
		sprit(str);
		
	}
	
	public void sprit(String str) {
		str = str.replace("\"\"","'");
		System.out.println(str);
		sArray = str.split(",");
		for(int i=0; i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
	}
}
