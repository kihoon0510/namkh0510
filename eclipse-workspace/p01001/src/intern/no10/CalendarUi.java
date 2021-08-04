package intern.no10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarUi {
	private int year, month;
	int dayOfWeekNum;
	int end;
	
	public CalendarUi(int year, int month) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		
		LocalDate localDate = LocalDate.of(year, month, 1);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		dayOfWeekNum =dayOfWeek.getValue();
		System.out.println(dayOfWeekNum);
		
		System.out.println(localDate.lengthOfMonth());
		end = localDate.lengthOfMonth();
		
		draw();
		
	}
	
	public void draw() {
		System.out.println(year+"년 "+month+"월");
		System.out.println("일 월 화 수 목 금 토");
		for(int i=0;i<dayOfWeekNum;i++) {
			System.out.print("  ");
		}
		for(int i=1;i<end;i++) {
			System.out.print(" "+(i));
			if((i+dayOfWeekNum)%7==0) {
				System.out.println("");
			}
		}
	}
	
}
