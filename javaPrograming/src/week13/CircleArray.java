package week13; //반지름이 0~4인 Circle 객체를 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적 출력
class Circle{
	int radius; // 반지름을 저장하는 변수
	
	// 생성자: Circle 객체를 생성할 때 반지름을 설정합니다.
	public Circle(int radius) {
		this.radius = radius; //3번줄 int radius 생성자의 객체변수.오른쪽(6번줄에 int radius값이 들어감)이 왼쪽으로 들어감
	}
	
	// getArea 메서드: 원의 면적을 계산하여 반환합니다.
	public double getArea() {
		return 3.14*radius*radius; //값 반환 3.14*반지름*반지름;
		//Circle[] c = new Circle[5];: Circle 객체를 저장할 배열을 생성합니다.
		//첫 번째 for 루프: 배열의 각 요소에 반지름이 0부터 4까지인 Circle 객체를 생성하여 할당합니다.
		//두 번째 for 루프: 배열의 각 Circle 객체의 면적을 계산하여 출력합니다.
	}
}

public class CircleArray {
	public static void main(String[] args) { //메인 먼저 /값 반환 X
		Circle [] c; //Circle 클래스의 c라는 이름의 배열을 선언합니다
		c = new Circle[5]; //c는 Circle 클래스의 인스턴스를 저장하는 배열
		
		for(int i=0; i<c.length; i++) { // 배열의 각 요소에 반지름이 0부터 4까지인 Circle 객체를 생성하여 할당합니다.
			c[i] = new Circle(i); 
		}
		for(int i=0; i<c.length; i++) { // 배열의 각 Circle 객체의 면적을 계산하여 정수형으로 출력합니다.
			System.out.print((int)(c[i].getArea())+" ");
		// TODO Auto-generated method stub
		}
	}
}
