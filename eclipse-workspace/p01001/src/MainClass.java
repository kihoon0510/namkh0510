import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

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
import intern.no09.DateCompare;
import intern.no10.CalendarUi;

public class MainClass {
	public static void main(String[] args) {
		

		/*
		  System.out.println(new ToStringWith(30, 20));
		  
		  int area =0;
		  //�� ���� ���̸� �̿��� �簢�� ���� ���ϱ�. 
		  Square sq = new Square(10, 10); 
		  area =sq.getArea(); 
		  System.out.println(area);
		  
		  
		  //�غ��� ���̿� ���̸� �̿��� �ﰢ�� ���� ���ϱ�. 
		  Triangle tr = new Triangle(10, 5); area
		  =tr.getArea(); System.out.println(area);
		  
		  
		  //sin���� �̿��� �ﰢ�� ���� ���ϱ�. 
		  Triangle tr2 = new Triangle(10, 14, 40); 
		  area =tr2.getArea(); System.out.println(area);
		  
		  //������ ���� �Է��Ͽ� ���� ���� ���ϱ�. 
		  Circle ci = new Circle(5); 
		  area = ci.getArea();
		  System.out.println(area);
		  
		  //������� �ν��Ͻ� ���� ���� 
		  InstanceCount ic = new InstanceCount(); 
		  InstanceCount ic2 = new InstanceCount(); 
		  InstanceCount ic3 = new InstanceCount();
		 
		
		  Stack stack = new Stack(100); //������ ũ�� ����. stack.push("hi");
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
		  //double�� 15�ڸ����� ��Ȯ���� ����.
		 		
		
		
		  Round rd = new Round(54436.12345678, -6); //(����, �ݿø� �ڸ���) �ڸ����� ������ ������ �Ҽ�����ġ 
		  rd.getValue();
		 
		
		
		//No07 1�����迭�� 3���� �迭ó�� ����ϱ�
		ThreeDArray tda = new ThreeDArray(2, 2, 2);
		tda.put(1, 1, 1, 1);
		tda.put(2, 1, 1, 2);
		tda.put(1, 2, 1, 3);
		
		
		tda.showArray();
		
		tda.get(2, 1, 1);
		
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("hi");
		as.add("hi");
		System.out.println(as);
		System.out.println(as.size());
		System.out.println(as.isEmpty());
		
		
		MyArrayList<Integer> mal = new MyArrayList<Integer>();
		mal.add(3);
		System.out.println("mal:"+mal.size());
		System.out.println(mal);
		
		
		
		DateCompare dc = new DateCompare();

		*/
		LocalDate initial = LocalDate.of(2014, 2, 13);
		LocalDate start = initial.withDayOfMonth(1);
		LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
		System.out.println(start);
		System.out.println(end);
		
		CalendarUi cu = new CalendarUi(2000, 6);
	}
}
