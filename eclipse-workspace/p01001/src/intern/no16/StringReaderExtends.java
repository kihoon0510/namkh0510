package intern.no16;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class StringReaderExtends extends StringReader {
	boolean b = false;
	int point;
	ArrayList<Integer> pointList = new ArrayList<Integer>();
	StringBuffer buffer = new StringBuffer();
	ArrayList<Character> arrayList = new ArrayList<Character>();
	String str;
	int i = 0;

	public StringReaderExtends(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public void setContinationMode(boolean b) {
		this.b = b;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void readLine() {
		try {
			while ((i = read()) != -1) {
				if ((char) i == '\\') {
				}
				arrayList.add((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int j = 0; j < arrayList.size(); j++) {
			if (arrayList.get(j) == '\\') {
				point = j;
				pointList.add(point);
			}
		}

		for (int x = 0; x < pointList.size(); x++) {
			if (arrayList.get(pointList.get(x) + 1).equals('\n')) {
				System.out.println(pointList.get(x));
				int newpoint = pointList.get(x);
				arrayList.remove(newpoint);
				arrayList.remove(newpoint);
			} else
				for (int y = 0; y < arrayList.size(); y++) {
					buffer.append(arrayList.get(y));
				}
		}

		System.out.println(buffer);

	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}
}
