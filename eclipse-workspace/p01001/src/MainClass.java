import java.util.ArrayList;

import intern.no01.ToStringWith;
import intern.no02.Circle;
import intern.no02.Square;
import intern.no02.Triangle;
import intern.no03.InstanceCount;
import intern.no04.Stack;
import intern.no05.RepeatSum;
import intern.no06.Round;
import intern.no07.ThreeDArray;
import intern.no08.MyArrayList;

public class MainClass {
	public static void main(String[] args) {
		

		/*
		  System.out.println(new ToStringWith(30, 20));
		  
		  int area =0;
		  //두 변의 길이를 이용한 사각형 넓이 구하기. 
		  Square sq = new Square(10, 10); 
		  area =sq.getArea(); 
		  System.out.println(area);
		  
		  
		  //밑변의 길이와 높이를 이용한 삼각형 넓이 구하기. 
		  Triangle tr = new Triangle(10, 5); area
		  =tr.getArea(); System.out.println(area);
		  
		  
		  //sin값을 이용한 삼각형 넓이 구하기. 
		  Triangle tr2 = new Triangle(10, 14, 40); 
		  area =tr2.getArea(); System.out.println(area);
		  
		  //반지름 값을 입력하여 원의 넓이 구하기. 
		  Circle ci = new Circle(5); 
		  area = ci.getArea();
		  System.out.println(area);
		  
		  //사용중인 인스턴스 갯수 추적 
		  InstanceCount ic = new InstanceCount(); 
		  InstanceCount ic2 = new InstanceCount(); 
		  InstanceCount ic3 = new InstanceCount();
		 
		
		  Stack stack = new Stack(100); //스택의 크기 정의. stack.push("hi");
		  stack.push("hi2"); 
		  stack.push("hi3"); 
		  stack.pop(); 
		  stack.pop(); 
		  stack.pop();
		  stack.pop(); 
		  stack.pop(); 
		  stack.top(); 
		  stack.isEmpty(); 
		  stack.isFull();
		  stack.push(new Integer(5)); 
		  stack.push(new Double(5.5)); 
		  stack.top();
		  stack.isEmpty(); 
		  stack.isFull();
		 
		
		
		  RepeatSum rs = new RepeatSum(20, 0.1); 
		  System.out.println(rs.value());
		  //double은 15자리까지 정확도를 유지.
		 		
		
		
		  Round rd = new Round(54436.12345678, -6); //(더블값, 반올림 자리수) 자리수에 음수를 넣으면 소수점위치 
		  rd.getValue();
		 
		
		
		//No07 1차원배열을 3차원 배열처럼 사용하기
		ThreeDArray tda = new ThreeDArray(2, 2, 2);
		tda.put(1, 1, 1, 1);
		tda.put(2, 1, 1, 2);
		tda.put(1, 2, 1, 3);
		
		
		tda.showArray();
		
		tda.get(2, 1, 1);
		
		*/
		ArrayList<String> as = new ArrayList<String>();
		as.add("hi");
		as.add("hi");
		System.out.println(as);
		System.out.println(as.size());
		
		
		MyArrayList<String> mal = new MyArrayList<String>();
		mal.add("hi");
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1.length);
		
	}
}
