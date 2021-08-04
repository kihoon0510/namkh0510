package intern.no11;



public class SpriteString {
	private int point;
	private char sp;
	private String cityState,city,state;
	
	// 입력받은 문자열에서 .을 찾아서 각각 따로 저장.
	public SpriteString(String city,char sp) {
		// TODO Auto-generated constructor stub
		this.cityState = city;
		this.sp = sp;
	}
	
	public void sprite() {
		for(int i=0;i<cityState.length();i++) {
			if(cityState.charAt(i)==sp) {
				point = i;
			}
		}
		city = cityState.substring(0,point);
		state = cityState.substring(point+1, cityState.length());
		
		System.out.println(city+", "+state);
		
	}

}
