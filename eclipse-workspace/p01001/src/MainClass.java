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

		// no01 Object�� toString�� �������̵��Ͽ� �ؽõ��� ����.
		System.out.println(new ToStringWith(30, 20));

		int area = 0;
		// no02 Shape �߻� Ŭ������ �߻�޼��带 ��ӹ޾� ��,�簢�� �� ������ ���̸� ����.
		Square sq = new Square(10, 10);
		area = sq.getArea();
		System.out.println(area);

		Triangle tr = new Triangle(10, 5);
		area = tr.getArea();
		System.out.println(area);

		// �ﰢ���� ���̴� �غ�*���� �� �� ���� ���̿� ������ ���� ���̸� ���� �� �ִ�.
		Triangle tr2 = new Triangle(10, 14, 40);
		area = tr2.getArea();
		System.out.println(area);

		Circle ci = new Circle(5);
		area = ci.getArea();
		System.out.println(area);

		// no03 static�� ���� ������ ��ü�� ���� ���Ͽ���.
		InstanceCount ic = new InstanceCount();
		InstanceCount ic2 = new InstanceCount();
		InstanceCount ic3 = new InstanceCount();

		// no04
		Stack stack = new Stack(100);
		stack.push("hi");
		stack.push("hi2");
		stack.push("hi3");
		stack.push(5);
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

		// no05 double�� 15�ڸ��� ���� ��Ȯ���� ���� ��Ȯ�Ѱ��� �ƴ�.
		RepeatSum rs = new RepeatSum(20, 0.1);
		System.out.println(rs.value());
		// double

		// no06 double ���� �ݿø� ���ϴ� ��ġ(�����ϰ�� �Ҽ��� �ڸ�)
		Round rd = new Round(54436.12345678, -6); // 
		rd.getValue();

		// no07 
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

		// no08 - �̿ϼ�
		MyArrayList<Integer> mal = new MyArrayList<Integer>();
		mal.add(3);
		System.out.println("mal:" + mal.size());
		System.out.println(mal);

		// no09
		DateCompare dc = new DateCompare();

		// no10
		CalendarUi cu = new CalendarUi(2000, 8);

		// no11
		SpriteString ss = new SpriteString("Seattle.WA", '.');
		ss.sprite();

		// no12
		StringFormat sf = new StringFormat();
		sf.append("It's a nice");
		sf.append("day, isn't it, Mr. Mxyzzptllxy?");
		sf.append("I think we should");
		sf.append("go for a walk.");

		sf.show();

		// no13 
		StringSort ss1 = new StringSort();
		ss1.append("Contents");
		ss1.append("1 Usage");
		ss1.append("2 Encoding");
		ss1.append("2.1 Character encodings");
		ss1.append("2.2 Control codes");
		ss1.append("3 See also");

		ss1.lSort();
		ss1.cSort();
		ss1.rSort();
		ss1.show();

		// no14
		BackToFront btf = new BackToFront("Father Charles Goes Down And Ends Battle");

		// no15
		ReadCsv rc = new ReadCsv();
		rc.convert("1,\"says \"\"aa\"\"\",c\r\n" + "2,\"\"\"2,130\"\"\",d\r\n" + "3,hi,\"\"\"aaa\"\"\r\n"
				+ "\"\"ddd\"\r\n" + "4,yyy,zzz");
		
		
	}
}
