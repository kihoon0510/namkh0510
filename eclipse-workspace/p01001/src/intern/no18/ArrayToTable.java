package intern.no18;

import java.nio.Buffer;
import java.util.ArrayList;

public class ArrayToTable {

	private ArrayList<String> titleList = new ArrayList<String>();
	private ArrayList<String> contentList = new ArrayList<String>();

	char[] chars;
	int titleCount = 0, contentCount = 0;

	public ArrayList<String> title(String str) {
		convertToArray(str, titleList);
		titleCount = titleList.size();

		return titleList;
	}

	public ArrayList<String> contents(String str) {
		convertToArray(str, contentList);
		contentCount = contentList.size();

		return contentList;
	}

	private void convertToArray(String s, ArrayList<String> list) {
		StringBuffer buffer;
		String tempStr;
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
				list.add(buffer.toString().trim());
				dataStartPoint = i + 1;
			}

			if (chars[i] == '\n' || i == chars.length - 1) {
				buffer = new StringBuffer();
				buffer.append(s.substring(dataStartPoint, doubleQuotesStartPoint));
				buffer.append(s.substring(doubleQuotesStartPoint + 1, doubleQuotesEndPoint).replace("\"\"", "\""));
				buffer.append(s.substring(doubleQuotesEndPoint + 1, i));
				buffer.deleteCharAt(buffer.length() - 1);
				list.add(buffer.toString().trim());
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

	public void show() {
		StringBuffer buffer = new StringBuffer();

		int culumCount = titleList.size(); // 10
		int[] culumSize = new int[culumCount];
		for (int i = 0; i < titleList.size(); i++) {
			culumSize[i] = titleList.get(i).length();
		}

		for (int i = 0; i < contentList.size(); i++) {
			if (contentList.get(i).length() > culumSize[i % 10]) {
				culumSize[i % 10] = contentList.get(i).length();
			}
		}

		String line = tableLine(culumCount, culumSize);
		buffer.append(line);
		for (int i = 0; i < culumCount; i++) {
			buffer.append("|");
			buffer.append(titleList.get(i));
			for (int j = 0; j < culumSize[i] - titleList.get(i).length(); j++) {
				buffer.append(" ");
			}
		}
		buffer.append("|\n");
		buffer.append(line);

		drawContents(culumCount, buffer, culumSize);
		buffer.append(line);
		System.out.println(buffer);
	}

	private void drawContents(int culumCount, StringBuffer buffer, int[] culumSize) {
		int rowCount = (contentList.size() / 10);
		for (int x = 0; x < rowCount; x++) {
			for (int i = 0; i < culumCount; i++) {
				buffer.append("|");
				buffer.append(contentList.get((10*x)+i));
				for (int j = 0; j < culumSize[i] - contentList.get((10*x)+i).length(); j++) {
					buffer.append(" ");
				}
			}
			buffer.append("|\n");
		}
	}

	private String tableLine(int culumCount, int[] culumSize) {
		StringBuffer buffer = new StringBuffer();
		for (int j = 0; j < culumCount; j++) {
			buffer.append("+");
			for (int i = 0; i < culumSize[j]; i++) {
				buffer.append("-");
			}
		}
		buffer.append("+\n");
		return buffer.toString();
	}

}
