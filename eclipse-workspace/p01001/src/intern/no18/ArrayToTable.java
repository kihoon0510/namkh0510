package intern.no18;

import java.util.ArrayList;

public class ArrayToTable {

	ArrayList<String> titleList = new ArrayList<String>();
	ArrayList<String> contentList = new ArrayList<String>();
	String title;
	String contents;
	char[] chars;

	public void title(String str) {
		this.title = str;
		convertTitleToArray(title);
		System.out.println(titleList);

	}

	public void contents(String str) {
		this.contents = str;

	}

	public void convertTitleToArray(String s) {
		StringBuffer buffer;
		int commaStartPoint = 0; // ,시작 위치.
		chars = s.toCharArray();
		int doubleQuotesEndPoint = 0, doubleQuotesStartPoint = 0; // "의 마지막 위치.
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '"') {
				doubleQuotesStartPoint = i;
				doubleQuotesEndPoint = findNextDoubleQuotes(i);
				i = doubleQuotesEndPoint;
			} else if (chars[i] == ',') {
				buffer = new StringBuffer();
				buffer.append(s.substring(commaStartPoint, doubleQuotesStartPoint));
				buffer.append(s.substring(doubleQuotesStartPoint+1, doubleQuotesEndPoint).replace("\"\"", "\""));
				buffer.append(s.substring(doubleQuotesEndPoint+1, i));
				titleList.add(buffer.toString());
				commaStartPoint = i + 1;
			}
			if(chars[i]=='\n' || i== chars.length-1) {
				buffer = new StringBuffer();
				buffer.append(s.substring(commaStartPoint, doubleQuotesStartPoint));
				buffer.append(s.substring(doubleQuotesStartPoint+1, doubleQuotesEndPoint).replace("\"\"", "\""));
				buffer.append(s.substring(doubleQuotesEndPoint, i));
				titleList.add(buffer.toString());
				commaStartPoint = i + 1;
			}
			
		}
	}

	private int findNextDoubleQuotes(int startPoint) {
		int endPoint = 0;
		for (int i = startPoint + 1; i < title.length(); i++) {
			
				try {
					if (chars[i] == '"') {
						if (chars[i + 1] == '"') {
							i++;
							continue;
						}
						endPoint = i;
						return endPoint;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					return title.length()-1;
				}
			
		}
		return 0;
	}

}
