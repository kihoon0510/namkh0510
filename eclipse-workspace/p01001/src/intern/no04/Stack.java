package intern.no04;

public class Stack {
	
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
	
	
	
	private void show() {
		System.out.print("[");
		for(int i=1; i<nowPoint; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("]");
		System.out.println("���� ��ġ: "+nowPoint);
	}
}
