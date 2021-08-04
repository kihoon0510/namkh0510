package intern.no04;

public class Stack {
	
	// 스택의 값이 들어올 위치를 추적하여 해당 위치로만 값을 입력받음
	private static int nowPoint=1;
	private Object[] array;
	
	
	public Stack(int size) {
		array = new Object[size];
	}
	
	public void push(Object object) {
		array[nowPoint] = object;
		nowPoint++;
		show();
	}
	
	// 값을 제거시 현재 위치를 같이 줄여준다.
	public void pop() {
		if(nowPoint>1)nowPoint--;
		array[nowPoint] = null;
		show();
	}
	
	public Object top() {
		System.out.println("Top: "+array[nowPoint-1]);
		return array[nowPoint-1];
	}
	
	public void isEmpty() {
		if(nowPoint ==0) {
			System.out.println("isEmpty: False");
		}
		else if(array[nowPoint-1] !=null) {
			System.out.println("isEmpty: False");
		}else {
		System.out.println("isEmpt: True");
		}
	}
	
	public void isFull() {
		
		if(nowPoint ==0) {
			System.out.println("isFull: True");
		}
		else if(array[nowPoint-1] !=null) {
			System.out.println("isFull: True");
		}else {
		System.out.println("isFull: False");
		}
	}
	
	
	// 현재 위치와 스택의 모든 값을 보여준다.
	private void show() {
		System.out.print("[");
		for(int i=1; i<nowPoint; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("]");
		System.out.println("현재 위치: "+nowPoint);
	}
}
