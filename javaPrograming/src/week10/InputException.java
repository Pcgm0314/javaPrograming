package week10;
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n=0; //변수 sum, n 선언
		for(int i=0; i<3;i++) { //i가 012까지 3번 증가
			System.out.print(i+">>");//i >> 출력
			try {
				n=scanner.nextInt();
				//n은 scanner.nextInt 오류 검사
			}
			catch(InputMismatchException e) {//InputMismatchException e 오류나면 잡음
				System.out.println("정수가 아닙니다. 다시 입력하세요!");//
				scanner.next();//입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;//인덱스가 증가하지 않도록 i값 미리 감소
				continue;//다음 루프
			}
			sum += n;//sum을 n에 합하기
		}
		System.out.println("합은"+ sum);
		scanner.close();
	}

}
