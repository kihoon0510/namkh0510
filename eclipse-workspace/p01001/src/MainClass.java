import intern.no18.ArrayToTable;


public class MainClass {
	public static void main(String[] args) {
//
//		// no01 Object의 toString을 오버라이드하여 해시등을 지움.
//		
//		System.out.println(new ToStringWith(30, 20));
//
//		// no02 Shape 추상 클래스의 추상메서드를 상속받아 삼,사각형 및 원형의 넓이를 구함.
//		
//		int shapeArea = 0; 
//		Square sq = new Square(10, 10);
//		shapeArea = sq.getArea();
//		System.out.println(shapeArea);
//
//		Triangle triangle = new Triangle(10, 5);
//		shapeArea = triangle.getArea();
//		System.out.println(shapeArea);
//
//		// 삼각형의 넓이는 밑변*높이 와 두 변의 길이와 각도를 통해 넓이를 구할 수 있다.
//		
//		Triangle triangle2 = new Triangle(10, 14, 40);
//		shapeArea = triangle2.getArea();
//		System.out.println(shapeArea);
//
//		Circle circle = new Circle(5);
//		shapeArea = circle.getArea();
//		System.out.println(shapeArea);
//
//		// no03 static을 통해 생성된 객체의 수를 구하였다.
//		
//		InstanceCount instanceCount = new InstanceCount();
//		InstanceCount instanceCount2 = new InstanceCount();
//		InstanceCount instanceCount3 = new InstanceCount();
//		instanceCount = null;
//
//		InstanceCount instanceCount4 = new InstanceCount();
//
//		// no04
//		
//		MyStack stack = new MyStack(100);
//		stack.push("hi");
//		stack.push("hi2");
//		stack.push("hi3");
//		stack.push(5);
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.top();
//		stack.isEmpty();
//		stack.isFull();
//		stack.push(new Integer(5));
//		stack.push(new Double(5.5));
//		stack.top();
//		stack.isEmpty();
//		stack.isFull();
//
//		// no05 double은 15자리수 까지 정확도를 유지 정확한값은 아님.
//		
//		RepeatSum repeatSum = new RepeatSum(20, 0.1);
//		System.out.println(repeatSum.value());
//
//		// no06 double 값과 반올림 원하는 위치(음수일경우 소수점 자리)
//		
//		Round round = new Round(54436.12345678, 3); // round.getValue();
//
//		// no07
//		
//		ThreeDArray threeDArray = new ThreeDArray(2, 2, 2);
//		threeDArray.put(1, 1, 1, 1);
//		threeDArray.put(2, 1, 1, 2);
//		threeDArray.put(1, 2, 1, 3);
//		threeDArray.showArray();
//
//		threeDArray.get(2, 1, 1);
//
//		ArrayList<String> arrayString = new ArrayList<String>();
//		arrayString.add("hi");
//		arrayString.add("hi");
//		System.out.println(arrayString);
//		System.out.println(arrayString.size());
//		System.out.println(arrayString.isEmpty());
//
//		// no08 - 미완성
//		
//		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
//		myArrayList.add(3);
//		System.out.println("mal:" + myArrayList.size());
//		System.out.println(myArrayList);
//
//		// no09
//		
//		DateCompare dateCompare = new DateCompare();
//
//		// no10
//		
//		CalendarUi calendarUi = new CalendarUi(2000, 8);
//
//		// no11
//		
//		SpriteString spriteString = new SpriteString("Seattle.WA", '.');
//		spriteString.sprite();
//
//		// no12
//		
//		StringFormat stringFormat = new StringFormat();
//		stringFormat.append("It's a nice");
//		stringFormat.append("day, isn't it, Mr. Mxyzzptllxy?");
//		stringFormat.append("I think we should");
//		stringFormat.append("go for a walk.");
//
//		stringFormat.show();
//
//		// no13
//		
//		StringSort stringSort = new StringSort();
//		stringSort.append("Contents");
//		stringSort.append("1 Usage");
//		stringSort.append("2 Encoding");
//		stringSort.append("2.1 Character encodings");
//		stringSort.append("2.2 Control codes");
//		stringSort.append("3 See also");
//
//		stringSort.lSort();
//		stringSort.cSort();
//		stringSort.rSort();
//		stringSort.show();
//
//		// no14
//		
//		BackToFront backToFront = new BackToFront("Father Charles Goes Down And Ends Battle");
//
//		// no15 read()메서드를 통해 데이터 입력 convert()메서드를 통해 csv형태로 변환.
//		// :wq 입력시 종료, CRLF입력시 줄바꿈
//		
//		ConvertToCSV convertToCSV = new ConvertToCSV();
//		convertToCSV.read();
//		convertToCSV.convertToCSV();
//
//		// no16
//		
//		String str = "Here is something I wanted to say:\\\n" + "Try and Buy in every way.\\\n" + "Go Team!\\\n" + "";
//
//		String str2 = "From: ian Tuesday, January 1, 2000 8:45 AM EST\n" + "To: Book-reviewers List\n"
//				+ "Received: by darwinsys.com (OpenBSD 2.6)\n" + " from localhost\n"
//				+ "    at Tuesday, January 1, 2000 8:45 AM EST\n"
//				+ "Subject: Hey, it's 2000 and MY computer is still up" + "";
//
//		StringReaderExtends extends1 = new StringReaderExtends(str2);
//		extends1.readLine();
//		
//		
//		// no17
//		
//		String annoStr = "/* This is a comment\n" + "\r\n" + "that continues\n" + "across lines\n" + "(\n"
//				+ "First line.\n" + "\n" + "/* This is a comment that\n" + "continues across lines \n"
//				+ "Second Line.\n" + "// This is a one-line comment\n" + "Third Line.\n"
//				+ "Fourth Line. // This is a one-line comment.\n" + "";
//
//		String test = "/* sdfsdfs*/\n 1 2 3 //gggg\n sdf //sdfsfdf";
//		System.out.println(annoStr);
//
//		ArrayList<String> v;
//		String s;
//		FindAnnotation findAnnotation = new FindAnnotation(annoStr);
//		v = findAnnotation.find();
//		s = findAnnotation.remove();
//		System.out.println(v);
//		System.out.println(s);
		

		String title = "\"last_nam,e\", \"goo,d\"\"firs,,t_name\"\"\", \"ema,il\", \"gender\", \"birthday\", \"profession\", \"location\", \"status\", \"interests\", \"seeking\"";

		System.out.println(title);
		ArrayToTable arrayToTable = new ArrayToTable();
		arrayToTable.title(title);
	}
}
