package intern.no09;

import java.util.Scanner;

public class DateCompare {

	private String[] dateBank1 = new String[3];
	private String[] dateBank2 = new String[3];
	private String date1, date2;

	private String first, second = "";

	public DateCompare() {
		// TODO Auto-generated constructor stub
		System.out.println("날짜 입력 형식: yyyy-mm-dd ");
		System.out.println("첫 번째 날짜:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		this.date1 = sc.next();
		System.out.println("두 번째 날짜:");
		this.date2 = sc.next();
		compare(date1, date2);
	}

	public void compare(String d1, String d2) {

		dateBank1 = d1.split("-");
		dateBank2 = d2.split("-");

		dayCompare(0);
		System.out.println(first + " is after " + second);
	}

	public void dayCompare(int i) {
		if (i > 2) {
			 System.out.println("same day");
		} else {
			if (Integer.parseInt(dateBank1[i]) > Integer.parseInt(dateBank2[i])) {
				first = date1;
				second = date2;
			} else if (Integer.parseInt(dateBank1[i]) == Integer.parseInt(dateBank2[i])) {
				dayCompare(i+=1);
			} else {
				first = date2;
				second = date1;
			}
		}
		
	}

}
