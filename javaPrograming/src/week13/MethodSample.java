package week13;

public class MethodSample {
	public int getSum(int i, int j) {//메소드
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		return i + j + k;
	}
	public double getSum(double i, double j) {
		return i+j;
	}
	public String getSums(double i, int j) {
		return String.valueOf(i+j); //숫자를 문자로 바꿔주는 String.valueof사용
	}

	public static void main(String[] args) { //main
		MethodSample a = new MethodSample(); //MethodSample클래스의 a 생성자 이름으로 초기화
		int i = a.getSum(1, 2);			//정수형 i 는 4번째줄 a.getSum 3->i에 들어감 
		int j = a.getSum(1, 2, 3); 		//정수형 j 는 8번째줄 a.getSum 6->j에 들어감 
		double k= a.getSum(1.1, 2.2);	//소수형 k 는 11번째줄 a.getSum 3.3-> k에 들어감
		String s = a.getSums(1.1, 2);	//문자형 j 는 14번째줄 a.getSum 3.1->s에 들어감
	}//Intrger.parseInt(www)-정수형 /Double.parseDouble(www)-소수형/String.valueof(www)-문자열로 변환

}
