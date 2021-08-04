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
		System.out.println(year+"�� "+month+"��");
		System.out.println("�� �� ȭ �� �� �� ��");
		for(int i=0;i<down;i++) {
			System.out.print("  ");
		}
		for(int i=1;i<end;i++) {
			System.out.print(" "+(i));
			if((i+down)%7==0) {
				System.out.println("");
			}
		}
	}
	
}
