package intern.no18;

import java.util.ArrayList;

public class ArrayToTable {

	private ArrayList<String> titleList = new ArrayList<String>();
	private ArrayList<String> contentList = new ArrayList<String>();

	char[] chars;
	int titleCount = 0, contentCount = 0;

	public ArrayList<String> title(String str) {
		convertToArray(str, titleList);
		titleCount = titleList.size();
		System.out.println(titleList + "titleCount: " + titleCount);
		
		return titleList;
	}

	public ArrayList<String> contents(String str) {
		convertToArray(str, contentList);
		contentCount = contentList.size();
		System.out.println(contentList + "contentCount: " + contentCount);

		return contentList;
	}

	private void convertToArray(String s, ArrayList<String> list) {
		StringBuffer buffer;
		int dataStartPoint = 0; // ,시작 위치.
		chars = s.toCharArray();
		int doubleQuotesEndPoint = 0, doubleQuotesStartPoint = 0; // "의 마지막 위치.
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '"') {
				doubleQuotesStartPoint = i;
				doubleQuotesEndPoint = findNextDoubleQuotes(i, s);
				i = doubleQuotesEndPoint;
			} else if (chars[i] == ',') {
				buffer = new StringBuffer();
				buffer.append(s.substring(dataStartPoint, doubleQuotesStartPoint));
				buffer.append(s.substring(doubleQuotesStartPoint + 1, doubleQuotesEndPoint).replace("\"\"", "\""));
				buffer.append(s.substring(doubleQuotesEndPoint + 1, i));
				list.add(buffer.toString());
				dataStartPoint = i + 1;
			}

			if (chars[i] == '\n' || i == chars.length - 1) {
				buffer = new StringBuffer();
				buffer.append(s.substring(dataStartPoint, doubleQuotesStartPoint));
				buffer.append(s.substring(doubleQuotesStartPoint + 1, doubleQuotesEndPoint).replace("\"\"", "\""));
				buffer.append(s.substring(doubleQuotesEndPoint+1, i));
				buffer.deleteCharAt(buffer.length()-1);
				list.add(buffer.toString());
				dataStartPoint = i + 1;
			}
		}
	}

	private int findNextDoubleQuotes(int startPoint, String str) {
		int endPoint = 0;
		for (int i = startPoint + 1; i < str.length(); i++) {

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
				return str.length() - 1;
			}

		}
		return 0;
	}

}
