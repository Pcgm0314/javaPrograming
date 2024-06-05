package week11;

public class Circle {// class틀
	int radius; // 원의 반지름 필드 int정수형 radius 선언
	String name;// 원의 이름 필드 String문자열 name 선언

	public Circle() {}//원의 생성자 public범용적 Circle 선언

	public double getArea() { //원의 면적 계산 메소드
		return 3.14 * radius * radius; //class에 값 반환 => 3.14 * radius * radius
	}

	public static void main(String[] args) {//범용적 void(리턴 ㄴㄴ)메인(문자배열 args라는거 생성)
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();	//Circle 객체 생성
		pizza.radius = 10;		//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";	//피자의 이름 설정
		double area = pizza.getArea();//피자의 면적 알아내기 double소수형 area
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle();//Circle 객체 생성
		donut.radius = 2;		//도넛의 반지름을 2로 설정
		donut.name = "자바도넛";	//도넛의 이름 설정
		area = donut.getArea();	//도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
