package intern.no11;

public class SplitString {

	String str;
	char splitChar;

	public String[] split(String s, char c) {
		this.str = s;
		this.splitChar = c;
		int splitCount = 0;
		int[] splitPoint;
		StringBuffer buffer = new StringBuffer();
		char[] tempChars; // 문자 배열
		tempChars = str.toCharArray();
		for (int i = 0; i < tempChars.length; i++) {
			if (tempChars[i] == splitChar) {
				splitCount++; // 분리할 문자 개수
			}
		}
		splitPoint = new int[splitCount+1]; // 자르는 위치
		int temp = 0;
		for (int i = 0; i < tempChars.length; i++) {
			if (tempChars[i] == splitChar) {
				splitPoint[temp] = i;
				temp++;
			}
		}
		splitPoint[splitCount] = tempChars.length; // 문자 마지막위치

		String[] tempStr = new String[splitCount + 1]; // 리턴할 문자열 배열
		try {
			int begin = 0;
			
			for (int i = 0; i < splitCount + 1; i++) {
				for (int j = begin; j < splitPoint[i]; j++) {
					buffer.append(tempChars[j]);
				}
				tempStr[i] = buffer.toString();
				buffer = new StringBuffer();
				begin = splitPoint[i] + 1;
			}
		} catch (Exception e) {
		}
		return tempStr;
	}

}
