package intern.no15;

public class ReadCSV {
	String[] strArray;
	String str;
	
	public void convert(String str) {
		sprit(str);
		
	}
	
	public void sprit(String str) {
		str = str.replace("\"\"", " ");
	}
}
