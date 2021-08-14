package intern.no19;

import java.util.ArrayList;

public class SelectData {
	ArrayList<String> titleList;
	ArrayList<String> contentList;
	String[][] newData;
	char a='e';
	String b = "s";
	
	
	
	public SelectData(String[][] data) {
		titleList = new ArrayList<String>();
		contentList = new ArrayList<String>();
		String[] spl;
		newData = new String[data.length][data[0].length];
		String temp = "";
		String[] row = new String[data.length];
		for (int i = 0; i < data.length; i++) {  // 행마다 앞 3글자까지 비교하여 정렬
			row = data[i];
			for (int j = 0; j < row.length - 1; j++) {
				for (int y = j + 1; y < row.length; y++) {
					if (row[j].charAt(0) > row[y].charAt(0)) {
						temp = row[y];
						row[y] = row[j];
						row[j] = temp;
					}else if (row[j].charAt(0) == row[y].charAt(0)) {
						if (row[j].charAt(1) > row[y].charAt(1)) {
							temp = row[y];
							row[y] = row[j];
							row[j] = temp;
						}else if (row[j].charAt(1) == row[y].charAt(1)) {
							if (row[j].charAt(2) > row[y].charAt(2)) {
								temp = row[y];
								row[y] = row[j];
								row[j] = temp;
							}
						}
					}
				}
			}
			newData[i] = row;
		}
		for (String[] s : newData) {
			for (String s2 : s) {
				spl = s2.split("=", 2);
				if (!titleList.contains(spl[0])) {
					titleList.add(spl[0]);
				}
				contentList.add(spl[1]);
			}
		}
		System.out.println(titleList);
		System.out.println(contentList);

	}
	
	public void showTable() {
		StringBuffer buffer = new StringBuffer();

		int culumCount = titleList.size();  //7
		int[] culumSize = new int[culumCount];
		for (int i = 0; i < titleList.size(); i++) {
			culumSize[i] = titleList.get(i).length();
		}

		for (int i = 0; i < contentList.size(); i++) {
			if (contentList.get(i).length() > culumSize[i % culumCount]) {
				culumSize[i % culumCount] = contentList.get(i).length();
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
	

	private String tableLine(int culumCount, int[] culumSize) {
		StringBuffer buffer = new StringBuffer();
		for (int j = 0; j < culumCount; j++) {
			buffer.append("+");
			for (int i = 0; i < culumSize[j]; i++) {
				buffer.append("-");
			}
		}
		buffer.append("+ \n");
		return buffer.toString();
	}
	
	private void drawContents(int culumCount, StringBuffer buffer, int[] culumSize) {
		int rowCount = (contentList.size() / culumCount);
		try {
			for (int x = 0; x < rowCount; x++) { // 내용부분
				for (int i = 0; i < culumCount; i++) {
					buffer.append("|");
					buffer.append(contentList.get((culumCount * x) + i));
					for (int j = 0; j < culumSize[i] - contentList.get((culumCount * x) + i).length(); j++) {
						buffer.append(" ");
					}
				}
				buffer.append("|\n");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("제목 데이터 입력 오류!");
		}
	}

}
