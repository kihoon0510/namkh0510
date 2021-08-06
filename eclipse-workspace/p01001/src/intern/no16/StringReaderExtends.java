package intern.no16;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class StringReaderExtends extends StringReader {
	boolean b = false;
	ArrayList<Integer> pointListOfBackslash = new ArrayList<Integer>();
	ArrayList<Integer> pointListOfLineBreak = new ArrayList<Integer>();
	ArrayList<Character> arrayList = new ArrayList<Character>();
	StringBuffer buffer = new StringBuffer();
	int removeCount = 0; // 배열에서 제거한 수

	public StringReaderExtends(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public void setContinationMode(boolean b) {
		this.b = b;
	}

	public void readLine() {

		// arraylist에 각 문자별로 저장.
		int i = 0;
		try {
			while ((i = read()) != -1) {
				arrayList.add((char) i);
			}
			arrayList.add(' ');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// arraylist에서 역슬레시 및 줄바꿈 위치 찾고 각 배열에 추가.
		for (int j = 0; j < arrayList.size(); j++) {
			if (arrayList.get(j) == '\\') {
				pointListOfBackslash.add(j);
			} else if (arrayList.get(j) == '\n') {
				pointListOfLineBreak.add(j);
			}
		}

		// pointList에 저장되어 있는 역슬레시 위치별 문자열 처리.

		if (pointListOfBackslash.size() > 0) {
			try {
				for (int x = 0; x < pointListOfBackslash.size(); x++) {
					int backslashPoint = pointListOfBackslash.get(x) - removeCount;
					if (arrayList.get(backslashPoint + 1).equals('\n')) {
						arrayList.remove(backslashPoint);
						arrayList.remove(backslashPoint);
						removeCount += 2;
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (pointListOfLineBreak.size() > 0) {
			try {
				for (int z = 0; z < pointListOfLineBreak.size(); z++) {
					int lineBreakPoint = pointListOfLineBreak.get(z) - removeCount;
					int countBlank = 0; // 줄바꿈 다음 공백 수
					while (arrayList.get(lineBreakPoint + 1 + countBlank).equals(' ')) {
						countBlank++;
					}
					if (arrayList.get(lineBreakPoint + 1).equals(' ')) {
						for (int d = 0; d < countBlank; d++) {
							arrayList.remove(lineBreakPoint);
							removeCount++;
						}
					}
				}
			} catch (Exception e) {
			}
		}

		// 스트링버퍼에 처리한 문자열을 추가.
		for (int y = 0; y < arrayList.size(); y++) {
			buffer.append(arrayList.get(y));
		}

		System.out.println(buffer);

	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}
}
