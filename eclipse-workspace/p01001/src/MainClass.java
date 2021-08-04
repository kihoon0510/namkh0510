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
import intern.no11.SpriteString;
import intern.no12.StringFormat;
import intern.no13.StringSort;
import intern.no14.BackToFront;
import intern.no15.ReadCsv;

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
		
		//no09	
		MyArrayList<Integer> mal = new MyArrayList<Integer>();
		mal.add(3);
		System.out.println("mal:"+mal.size());
		System.out.println(mal);
				
		DateCompare dc = new DateCompare();

		//no10 달력 출력
		CalendarUi cu = new CalendarUi(2000, 8);
		
		//no11
		SpriteString ss = new SpriteString("Seattle.WA",'.');
		ss.sprite();
		
		//no12
		StringFormat sf = new StringFormat();
		sf.append("It's a nice");
		sf.append("day, isn't it, Mr. Mxyzzptllxy?");
		sf.append("I think we should");
		sf.append("go for a walk.");
		
		sf.show();
		
		
		//no13
		StringSort ss = new StringSort();
		ss.append("Contents");
		ss.append("1 Usage");
		ss.append("2 Encoding");
		ss.append("2.1 Character encodings");
		ss.append("2.2 Control codes");
		ss.append("3 See also");
		
		ss.cSort();
		ss.show();
		
		
		//no14
		BackToFront btf = new BackToFront("Father Charles Goes Down And Ends Battle");
		
		*/
		ReadCsv rc= new ReadCsv();
		rc.convert("1,\"says \"\"aa\"\"\",c\r\n"
				+ "2,\"\"\"2,130\"\"\",d\r\n"
				+ "3,hi,\"\"\"aaa\"\"\r\n"
				+ "\"\"ddd\"\r\n"
				+ "4,yyy,zzz");
	}
}
