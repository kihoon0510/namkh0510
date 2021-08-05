package intern.no15;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToCSV {

	private StringBuffer stringBuffer = new StringBuffer();
	private ArrayList<String> arrayList = new ArrayList<String>();

	public void read() {
		System.out.println(":wq 입력시 종료, CRLF입력시 줄바꿈");
		Scanner sc = new Scanner(System.in);
		String save = "";
		while (!save.equals(":wq")) {
			save = sc.nextLine();
			arrayList.add(save);
		}
		System.out.println(arrayList);

	}

	public void convert() {

		for (int i = 0; i < arrayList.size() - 1; i++) {
			stringBuffer.append(check(arrayList.get(i)));
		}

		System.out.println(stringBuffer);

	}

	// 문자열에 " or , 가 포함되어있는지 확인 후 큰따옴표로 감싸준다. CRLF일때 줄바꿈.
	// 공백시에도 따옴표로 감싸준다.
	private String check(String s) {
		String newString = null;
		StringBuffer buffer = new StringBuffer();

		if (s.equals("CRLF")) {
			return "\n";
		} else if (s.contains(",") || s.contains("\"")) {
			for (int i = 0; i < s.length(); i++) {
				buffer.append(s.charAt(i));
				if (s.charAt(i) == '\"') {
					buffer.append("\"");
				}
			}
			newString = "\"" + buffer + "\"";
			return newString;
		} else if (s.equals("")) {
			return "\"\"";
		}
		return s;

	}
	
	
}
