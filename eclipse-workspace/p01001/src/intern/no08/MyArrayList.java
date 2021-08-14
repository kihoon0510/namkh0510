package intern.no08;

public class MyArrayList<E> {
	int arraySize = 1; // array의 크기
	int addPoint = 0; // add 할 위치
	Object[] array = new Object[arraySize];;

	public boolean add(E elem) {
		Object[] temp;
		boolean addResult = true;
		try {

			array[addPoint] = elem; // 값 저장
			arraySize++;
			addPoint++; // 다음 입력 위치 증가
			temp = array; // 배열 값 백업
			array = new Object[arraySize]; // array의 크기를 1증가시킨 새로운 배열
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i]; // 임시 저장한 배열을 다시 가져옴

			}

		} catch (Exception e) {
			e.printStackTrace();
			addResult = false;

		}
		return addResult;
	}

	public Object remove(int index) {
		Object value = array[index];

		Object[] temp;
		temp = new Object[addPoint];

		for (int i = 0; i < index; i++) {
			temp[i] = array[i];
		}
		for (int i = index + 1; i < temp.length; i++) {
			temp[i - 1] = array[i];
		}
		addPoint--;
		arraySize--;
		array = temp;
		return value;
	}

	public boolean contains(E elem) {
		boolean isContain = false;
		for (Object ob : array) {
			if (ob == elem) {
				isContain = true;
				return isContain;
			}
		}
		return isContain;
	}

	public boolean isEmpty() {
		return this.addPoint == 0;
	}

	public int size() {
		return this.addPoint;
	}

	public Object get(int index) {
		if(index >= arraySize) {
			return null;
		}
		return array[index];

	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < array.length - 1; i++) {
			buffer.append(array[i]);
			if (!(i == array.length - 2)) {
				buffer.append(", ");
			}
		}

		return "[" + buffer + "]";
	}

}
