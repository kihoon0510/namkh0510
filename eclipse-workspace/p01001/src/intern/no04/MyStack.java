package intern.no04;

public class MyStack {
	
	// 스택의 값이 들어올 위치를 추적하여 해당 위치로만 값을 입력받음
	private int nextPoint=0;
	private int size=0;
	private Object[] array;
	
	
	public MyStack(int size) {
		this.size = size;
		array = new Object[this.size];
	}
	
	public void push(Object object) {
		if(nextPoint<size) {
			array[nextPoint] = object;
			nextPoint++;
			show();
		}else {
			System.out.println("Stack is Full");
		}
		
	}
	
	// 값을 제거시 현재 위치를 같이 줄여준다.
	public void pop() {
		nextPoint--;
		if(nextPoint<0) {
			nextPoint=0;
		}
		
		array[nextPoint] = null;
		show();
	}
	
	public Object top() {
		if(nextPoint ==0) {
			System.out.println("Top is null");
			return null;
		}
		System.out.println("Top: "+array[nextPoint-1]);
		return array[nextPoint-1];
	}
	
	public void isEmpty() {
		if(nextPoint ==0) {
			System.out.println("isEmpty: True");
		}
		else if(nextPoint >0) {
			System.out.println("isEmpty: False");
		}
	}
	
	public void isFull() {
		
		if(nextPoint ==0) {
			System.out.println("isFull: False");
		}
		else if(nextPoint>0) {
			System.out.println("isFull: True");
		}
	}
	
	
	// 현재 위치와 스택의 모든 값을 보여준다.
	private void show() {
		System.out.print("[");
		for(int i=0; i<nextPoint; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("]");
		//System.out.println("다음 입력 위치: "+nowPoint);
	}
}
