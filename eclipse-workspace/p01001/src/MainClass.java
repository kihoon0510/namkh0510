import java.util.ArrayList;

import intern.no01.ToStringWith;
import intern.no02.Circle;
import intern.no02.Square;
import intern.no02.Triangle;
import intern.no03.InstanceCount;
import intern.no04.MyStack;
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
import intern.no15.ReadCSV;

public class MainClass {
	public static void main(String[] args) {
		
	
		
		
		// no01 Object의 toString을 오버라이드하여 해시등을 지움.
		System.out.println(new ToStringWith(30, 20));

		int shapeArea = 0;
		// no02 Shape 추상 클래스의 추상메서드를 상속받아 삼,사각형 및 원형의 넓이를 구함.
		Square sq = new Square(10, 10);
		shapeArea = sq.getArea();
		System.out.println(shapeArea);

		Triangle triangle = new Triangle(10, 5);
		shapeArea = triangle.getArea();
		System.out.println(shapeArea);

		// 삼각형의 넓이는 밑변*높이 와 두 변의 길이와 각도를 통해 넓이를 구할 수 있다.
		Triangle triangle2 = new Triangle(10, 14, 40);
		shapeArea = triangle2.getArea();
		System.out.println(shapeArea);

		Circle circle = new Circle(5);
		shapeArea = circle.getArea();
		System.out.println(shapeArea);

		//  no03 static을 통해 생성된 객체의 수를 구하였다.
		InstanceCount instanceCount = new InstanceCount();
		InstanceCount instanceCount2 = new InstanceCount();
		InstanceCount instanceCount3 = new InstanceCount();
		instanceCount = null;

		InstanceCount instanceCount4 = new InstanceCount();
		
		// no04 
		MyStack stack = new MyStack(100);
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

		// no05 double은 15자리수 까지 정확도를 유지 정확한값은 아님.
		RepeatSum repeatSum = new RepeatSum(20, 0.1);
		System.out.println(repeatSum.value());

		// no06 double 값과 반올림 원하는 위치(음수일경우 소수점 자리)
		Round round = new Round(54436.12345678, 3); // 
		round.getValue();

		// no07 
		ThreeDArray threeDArray = new ThreeDArray(2, 2, 2);
		threeDArray.put(1, 1, 1, 1);
		threeDArray.put(2, 1, 1, 2);
		threeDArray.put(1, 2, 1, 3);
		threeDArray.showArray();

		threeDArray.get(2, 1, 1);

		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("hi");
		arrayString.add("hi");
		System.out.println(arrayString);
		System.out.println(arrayString.size());
		System.out.println(arrayString.isEmpty());

		// no08 - 미완성
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(3);
		System.out.println("mal:" + myArrayList.size());
		System.out.println(myArrayList);

		// no09
		DateCompare dateCompare = new DateCompare();

		// no10
		CalendarUi calendarUi = new CalendarUi(2000, 8);

		// no11
		SpriteString spriteString = new SpriteString("Seattle.WA", '.');
		spriteString.sprite();

		// no12
		StringFormat stringFormat = new StringFormat();
		stringFormat.append("It's a nice");
		stringFormat.append("day, isn't it, Mr. Mxyzzptllxy?");
		stringFormat.append("I think we should");
		stringFormat.append("go for a walk.");

		stringFormat.show();

		// no13 
		StringSort stringSort = new StringSort();
		stringSort.append("Contents");
		stringSort.append("1 Usage");
		stringSort.append("2 Encoding");
		stringSort.append("2.1 Character encodings");
		stringSort.append("2.2 Control codes");
		stringSort.append("3 See also");

		stringSort.lSort();
		stringSort.cSort();
		stringSort.rSort();
		stringSort.show();

		// no14
		BackToFront backToFront = new BackToFront("Father Charles Goes Down And Ends Battle");


		
		
		// no15
		ReadCSV readCSV = new ReadCSV();
		readCSV.convert("1,\"says \"\"aa\"\"\",c\r\n" + "2,\"\"\"2,130\"\"\",d\r\n" + "3,hi,\"\"\"aaa\"\"\r\n"
				+ "\"\"ddd\"\r\n" + "4,yyy,zzz");
		
		
		
		
	}
}
