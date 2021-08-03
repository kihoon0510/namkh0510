package intern.no10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarUi {
	private int year, month;
	int down;
	int end;
	public CalendarUi(int year, int month) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		
		LocalDate date = LocalDate.of(year, month, 1);
		DayOfWeek dow = date.getDayOfWeek();
		down =dow.getValue();
		System.out.println(down);
		
		String w =dow.getDisplayName(TextStyle.SHORT, Locale.KOREA);
		System.out.println(w);
		System.out.println(date.lengthOfMonth());
		end = date.lengthOfMonth();
		
		draw();
		
	}
	
	public void draw() {
		System.out.println(year+"년 "+month+"월");
		System.out.println("일 월 화 수 목 금 토");
		for(int i =0;i<down;i++) {
			System.out.print("  ");
		}
		for(int i=1;i<=7-down;i++) {
			System.out.print(" "+i);
		}
		System.out.println("");
		for(int i=1;i<end/7;i++) {
			for(int j=0;j<end-down;j++) {
				System.out.print(" "+(j+down));
				if(j+1/7==0) {
					System.out.println("");
				}
			}

		}
	}
	
}