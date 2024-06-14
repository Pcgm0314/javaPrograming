package week13;

class Calc { // Calc라는 클래스 선언
	public static int abs(int a) { // 공유 범용적인 패키지등등, 공유 하는 abc값을 공유해서 int형 으로 넘겨주겠다 
			// 정수형으로 반환 a라고 같이 0보다 크다면 ? , a를 출력 (:그렇지 않으면) -a를 붙여서 return하겠다
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
}

public class CalcEx { // 계산기 예제라는 이름으로
	public static void main(String[] args) {// 메인 실행
		// TODO Auto-generated method stub
		System.out.println(Calc.abs(-5));// 칼크라는 클래스를 찾아서 .은 하위라는 뜻으로 칼크라는 클래스 밑에 abcf를 찾으래 찾아서 -5값을 넣으래서 들어감
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}