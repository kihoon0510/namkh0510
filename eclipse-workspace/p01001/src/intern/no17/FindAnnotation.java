package intern.no17;

import java.util.ArrayList;

public class FindAnnotation {
	private ArrayList<Integer> pointList = new ArrayList<Integer>();
	private ArrayList<String> annotations = new ArrayList<String>();
	private String str;
	private String annoStr;
	private char[] chars;
	private StringBuffer buffer = new StringBuffer();
	String[] strs;

	public FindAnnotation(String s) {
		// TODO Auto-generated constructor stub
		this.str = s;
	}

	public String remove() {
		try {
			buffer.append(str.substring(0, pointList.get(0)));
			for (int i = 0; i < pointList.size(); i += 2) {
				buffer.append(str.substring(pointList.get(i + 1) + 1, pointList.get(i + 2) - 1));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

		return buffer.toString();

	}

	public ArrayList<String> find() {
		chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '/') {
				if (chars[i + 1] == '/') {
					pointList.add(i);
					i = findNextLineBreak(i + 1); // 주석이 끝난 위치로
				} else if (chars[i + 1] == '*') {
					pointList.add(i);
					i = findNextSlash(i + 1); // 주석이 끝난 위치로
				}
			}
		}
		System.out.println(pointList);

		for (int i = 0; i < pointList.size(); i += 2) {
			annoStr = str.substring(pointList.get(i), pointList.get(i + 1) + 1);
			annotations.add(annoStr);
		}

		return annotations;
	}

	private int findNextSlash(int startPoint) { // 주석이 끝난 위치 반환
		for (int i = startPoint + 1; i < str.length(); i++) {
			if (chars[i] == '*') {
				if (chars[i + 1] == '/') {
					pointList.add(i + 1);
					return i + 1;
				}
			}
		}
		return 0;
	}

	private int findNextLineBreak(int startPoint) { // 주석이 끝난 위치 반환
		for (int i = startPoint + 1; i < str.length(); i++) {
			if (chars[i] == '\n') {
				pointList.add(i - 1);
				return i - 1;
			} else if (i == str.length() - 1) {
				pointList.add(str.length() - 1);
				return str.length() - 1;
			}
		}
		return 0;
	}
}
