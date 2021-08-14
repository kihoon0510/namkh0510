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
//		threeDArray.put(0, 0, 0, 1);
//		threeDArray.put(1, 0, 0, 2);
//		threeDArray.put(2, 0, 0, 3);
//		threeDArray.put(0, 1, 0, 4);
//		threeDArray.put(1, 1, 0, 5);
//		threeDArray.put(2, 1, 0, 6);
//
//		
//		System.out.println(threeDArray);
//		System.out.println(threeDArray.get(0, 1, 0));
//
//		// no08 - 미완성
//		
//		MyArrayList<String> myArrayList = new MyArrayList<String>();
//		myArrayList.add("sdf6");
//		myArrayList.add("sdf7");
//		myArrayList.add("sdf8");
//		myArrayList.add("sdf2");
//		myArrayList.add("sdf3");
//		myArrayList.add("sdf4");
//		System.out.println(myArrayList);
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("remove: "+myArrayList.remove(3));
//		}
//		System.out.println("isEmpty? "+myArrayList.isEmpty());
//		myArrayList.add("sdf4");
//		myArrayList.add("sdf42");
//		
//		System.out.println(myArrayList);
//		System.out.println("size: "+myArrayList.size());
//		System.out.println("contain? "+myArrayList.contains("sdf42"));
//		int i=4;
//		System.out.println(i+" 번째 값: "+myArrayList.get(i));
//		
//		while(!myArrayList.isEmpty()) {
//			System.out.println("remove: "+ myArrayList.remove(0));;
//		}
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
//		String str = "Seattle, WA\r\n"
//				+ "Natchez, MS\r\n"
//				+ "Las Vegas, NV\r\n"
//				+ "Palo Alto, CA\r\n"
//				+ "NYC, NY\r\n"
//				+ "";
//		
//		SplitString spriteString = new SplitString();
//		String[] ss = spriteString.split(str,',');
//		for(String s: ss) {
//			System.out.println(s);
//		}
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
//
//		// no 18 
//		String title = "\"last_name\", \"first_name\", \"email\", \"gender\", \"birthday\", \"profession\", \"location\", \"status\", \"interests\", \"seeking\"\r\n";
//		String content = "\"Anderson\", \"Jillian\", \"jill_anderson@breakneckpizza.com\", \"F\", \"1980-09-05\", \"TechnicalWriter\", \"PaloAlto,CA\", \"single\", \"kayaking,reptiles\", \"relationship,friends\"\r\n"
//				+ "\"Kenton\", \"Leo\", \"lkenton@starbuzzcoffee.com\", \"M\", \"1974-01-10\", \"Manager\", \"SanFrancisco,CA\",\"divorced\", \"women\", \"womentodate\"\r\n"
//				+ "\"McGavin\", \"Darrin\", \"captainlove@headfirsttheater.com\", \"M\", \"1966-01-23\", \"CruiseShipCaptain\",\"SanDiego,CA\", \"single\", \"sailing,fishing,yachting\", \"womenforcasualrelationships\"\r\n"
//				+ "\"Franklin\", \"Joe\", \"joe_franklin@leapinlimos.com\", \"M\", \"1977-04-28\", \"SoftwareSales\", \"Dallas,TX\", \"married\", \"fishing,drinking\", \"newjob\"\r\n"
//				+ "\"Hamilton\", \"Jamie\", \"dontbother@starbuzzcoffee.com\", \"F\", \"1964-09-10\", \"SystemAdministrator\", \"Princeton,NJ\", \"married\", \"RPG\", \"nothing\"\r\n"
//				+ "\"Chevrolet\", \"Maurice\", \"bookman4u@objectville.net\", \"M\", \"1962-07-01\", \"BookshopOwner\", \"MountainView,CA\", \"married\", \"collectingbooks,scubadiving\", \"friends\"\r\n"
//				+ "\"Kroger\", \"Renee\", \"poorrenee@mightygumball.net\", \"F\", \"1976-12-03\", \"Unemployed\", \"SanFrancisco,CA\", \"divorced\", \"cooking\", \"employment\"\r\n"
//				+ "\"Mendoza\", \"Angelina\", \"angelina@starbuzzcoffee.com\", \"F\", \"1979-08-19\", \"UNIXSysadmin\", \"SanFrancisco,CA\", \"married\", \"acting,dancing\", \"newjob\"\r\n"
//				+ "\"Murphy\", \"Donald\", \"padraic@tikibeanlounge.com\", \"M\", \"1967-01-23\", \"ComputerProgrammer\", \"NewYorkCity,NY\", \"committedrelationsh\", \"RPG,anime\", \"friends\"\r\n"
//				+ "\"Spatner\", \"John\", \"jpoet@objectville.net\", \"M\", \"1963-04-18\", \"Salesman\", \"Woodstock,NY\", \"married\", \"poetry,screenwriting\", \"nothing\"\r\n"
//				+ "";
//
//		ArrayList<String> test = new ArrayList<String>();
//		ArrayToTable arrayToTable = new ArrayToTable();
//		arrayToTable.title(title);
//		test = arrayToTable.contents(content);
//		arrayToTable.showTable();
<<<<<<< HEAD
		

		String title = "\"last_nam,e\", \"goo,d\"\"firs,,t_name\"\"\", \"ema,il\", \"gender\", \"birthday\", \"profession\", \"location\", \"status\", \"interests\", \"seeking\"";

		String[][] data  = {
				{"구분=공동주택", "이름=양우내안애퍼스트힐", "세대수=780", "주소=울산광역시 남구 봉월로 55", "투표날짜=2020-01-01", "선거인수=770", "투표명=동대표선거"},
				{"구분=공동주택", "이름=불당지웰푸르지오", "세대수=682", "주소=충청남도 천안시 서북구 불당24로 38", "투표날짜=2020-09-01", "선거인수=682", "투표명=동별대표자 선출 및 관리규약개정 투표"},
				{"구분=공동주택", "이름=새뜸마을4단지", "세대수=1267", "주소=충청남도 서산시 안견로 457", "투표날짜=2020-07-21", "선거인수=1267", "투표명=입주자대표회의 임원(감사) 선거"},
				{"구분=공동주택", "세대수=1126", "이름=한신더휴센트럴파크", "주소=충청북도 청주시 청원구 오창공원로 96", "투표날짜=2020-05-11", "선거인수=1126", "투표명=입대회장, 감사, 동별대표자 보궐 선거"},
				{"구분=기타", "이름=신용회복위원회노동조합", "세대수=145", "주소=서울특별시 중구 세종대로 124", "투표날짜=2020-09-09", "선거인수=105", "투표명=신용회복위원회노동조합 2기 대의원 선출"},
				{"구분=공동주택", "이름=롯데캐슬 파크타운", "세대수=1200", "주소=경기도 파주시 파주리 521번지", "투표날짜=2020-11-12", "선거인수=1111", "투표명=관리규약 (일부) 개정 및 입주자대표회의 재선거/보궐선거"},
				{"구분=기타", "이름=한국경영학회", "주소=서울특별시 광진구 뚝섬로34길 67", "세대수=3060",  "투표날짜=2020-06-08", "선거인수=3058", "투표명=한국경영학회 2020년도 회장선거"},
				{"구분=공동주택", "이름=해운대아이파크", "세대수=1234", "투표날짜=2020-12-28", "선거인수=1234", "투표명=동별대표자선출", "주소=부산광역시 해운대구 마린시티2로 38"},
				{"구분=기타", "이름=국방과학연구소", "세대수=567", "주소=대전광역시 유성구 북유성대로488번길", "투표날짜=2020-03-02", "선거인수=566", "투표명=연구활동진흥비 등 지급방침 개정안"},
				{"구분=공동주택", "이름=문지효성해링턴플레이스아파트", "세대수=890", "투표날짜=2020-04-03", "주소=대전광역시 유성구 문지로 300", "선거인수=890", "투표명=동별 대표자 재(보궐)선출 선거"},
				{"구분=학교", "이름=수완초등학교", "세대수=1515", "주소=광주광역시 광산구 장덕로 143", "투표날짜=2020-07-11", "선거인수=1515", "투표명=2018년 2학기 전교임원선거"},
				{"구분=학교", "이름=서울교대부설초등학교", "주소=서울특별시 서초구 서초중앙로 96", "투표날짜=2020-11-11", "세대수=226", "선거인수=226", "투표명=2018학년도 2학기 서울교대부설초등학교 학생자치회 전교임원선거"},
				{"이름=원광정보예술고등학교", "세대수=30", "주소=전라북도 익산시 선화로13길 72", "투표날짜=2020-08-09", "선거인수=29", "투표명=원광정보예술고등학교 학생회장 및 부회장 선거(2018.2학기 - 2019.1학기)", "구분=학교"}
				};

=======
//		
//		//no19
//		String[][] data  = {
//				{"구분=공동주택", "이름=양우내안애퍼스트힐", "세대수=780", "주소=울산광역시 남구 봉월로 55", "투표날짜=2020-01-01", "선거인수=770", "투표명=동대표선거"},
//				{"구분=공동주택", "이름=불당지웰푸르지오", "세대수=682", "주소=충청남도 천안시 서북구 불당24로 38", "투표날짜=2020-09-01", "선거인수=682", "투표명=동별대표자 선출 및 관리규약개정 투표"},
//				{"구분=공동주택", "이름=새뜸마을4단지", "세대수=1267", "주소=충청남도 서산시 안견로 457", "투표날짜=2020-07-21", "선거인수=1267", "투표명=입주자대표회의 임원(감사) 선거"},
//				{"구분=공동주택", "세대수=1126", "이름=한신더휴센트럴파크", "주소=충청북도 청주시 청원구 오창공원로 96", "투표날짜=2020-05-11", "선거인수=1126", "투표명=입대회장, 감사, 동별대표자 보궐 선거"},
//				{"구분=기타", "이름=신용회복위원회노동조합", "세대수=145", "주소=서울특별시 중구 세종대로 124", "투표날짜=2020-09-09", "선거인수=105", "투표명=신용회복위원회노동조합 2기 대의원 선출"},
//				{"구분=공동주택", "이름=롯데캐슬 파크타운", "세대수=1200", "주소=경기도 파주시 파주리 521번지", "투표날짜=2020-11-12", "선거인수=1111", "투표명=관리규약 (일부) 개정 및 입주자대표회의 재선거/보궐선거"},
//				{"구분=기타", "이름=한국경영학회", "주소=서울특별시 광진구 뚝섬로34길 67", "세대수=3060",  "투표날짜=2020-06-08", "선거인수=3058", "투표명=한국경영학회 2020년도 회장선거"},
//				{"구분=공동주택", "이름=해운대아이파크", "세대수=1234", "투표날짜=2020-12-28", "선거인수=1234", "투표명=동별대표자선출", "주소=부산광역시 해운대구 마린시티2로 38"},
//				{"구분=기타", "이름=국방과학연구소", "세대수=567", "주소=대전광역시 유성구 북유성대로488번길", "투표날짜=2020-03-02", "선거인수=566", "투표명=연구활동진흥비 등 지급방침 개정안"},
//				{"구분=공동주택", "이름=문지효성해링턴플레이스아파트", "세대수=890", "투표날짜=2020-04-03", "주소=대전광역시 유성구 문지로 300", "선거인수=890", "투표명=동별 대표자 재(보궐)선출 선거"},
//				{"구분=학교", "이름=수완초등학교", "세대수=1515", "주소=광주광역시 광산구 장덕로 143", "투표날짜=2020-07-11", "선거인수=1515", "투표명=2018년 2학기 전교임원선거"},
//				{"구분=학교", "이름=서울교대부설초등학교", "주소=서울특별시 서초구 서초중앙로 96", "투표날짜=2020-11-11", "세대수=226", "선거인수=226", "투표명=2018학년도 2학기 서울교대부설초등학교 학생자치회 전교임원선거"},
//				{"이름=원광정보예술고등학교", "세대수=30", "주소=전라북도 익산시 선화로13길 72", "투표날짜=2020-08-09", "선거인수=29", "투표명=원광정보예술고등학교 학생회장 및 부회장 선거(2018.2학기 - 2019.1학기)", "구분=학교"}
//				};
//
//
>>>>>>> 194206e530f07fef3a56cff5edb9536d64785adf
//		SelectData selectData = new SelectData(data);
//		selectData.showTable();
		
		
	}
}
