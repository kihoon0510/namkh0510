import intern.Circle;
import intern.InstanceCount;
import intern.RepeatSum;
import intern.Round;
import intern.Square;
import intern.Stack;
import intern.ToStringWith;
import intern.Triangle;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * // System.out.println(new ToStringWith(30, 20));
		 * 
		 * int area =0;
		 * 
		 * //두 변의 길이를 이용한 사각형 넓이 구하기. Square sq = new Square(10, 10); area =
		 * sq.getArea(); System.out.println(area);
		 * 
		 * 
		 * //밑변의 길이와 높이를 이용한 삼각형 넓이 구하기. Triangle tr = new Triangle(10, 5); area
		 * =tr.getArea(); System.out.println(area);
		 * 
		 * 
		 * //sin값을 이용한 삼각형 넓이 구하기. Triangle tr2 = new Triangle(10, 14, 40); area
		 * =tr2.getArea(); System.out.println(area);
		 * 
		 * //반지름 값을 입력하여 원의 넓이 구하기. Circle ci = new Circle(5); area = ci.getArea();
		 * System.out.println(area);
		 * 
		 * //사용중인 인스턴스 갯수 추적 InstanceCount ic = new InstanceCount(); InstanceCount ic2 =
		 * new InstanceCount(); InstanceCount ic3 = new InstanceCount();
		 */
		/*
		 * Stack stack = new Stack(100); //스택의 크기 정의. stack.push("hi");
		 * stack.push("hi2"); stack.push("hi3"); stack.pop(); stack.pop(); stack.pop();
		 * stack.pop(); stack.pop(); stack.top(); stack.isEmpty(); stack.isFull();
		 * stack.push(new Integer(5)); stack.push(new Double(5.5)); stack.top();
		 * stack.isEmpty(); stack.isFull();
		 */
		
		/*
		 * RepeatSum rs = new RepeatSum(20, 0.1); System.out.println(rs.value());
		 * //double은 15자리까지 정확도를 유지.
		 */		
		
		Round rd = new Round(321.12345678, 5);
		rd.getRound();
		
	}
}
