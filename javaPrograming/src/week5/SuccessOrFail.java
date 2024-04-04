package week5;

import java.util.Scanner;

public class SuccessOrFail {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오:");
		int score = scanner.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다 ! 합격입니다.");//중괄호 안하면 밑에 한 줄만 실행 됨.
		}
		else {			//if로 작성할시 일을 2번하는 셈이라서 else 연산을 덜 , 더 빨라지고 효율이 좋아짐.
			System.out.println("불쌍합니다 불합격입니다.");//else if 이것도 2번의 연산을 하는셈이라 효율적이지 않음
		}
		scanner.close();
		
	}

}
