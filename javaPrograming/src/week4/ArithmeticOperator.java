package week4;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int time = scanner.nextInt(); //정수입력
		int second = time % 60;	//나머지 3	//60으로 나눈 나머지는 초
		int minute = (time/60)%60;	//몫 3을 60으로 또 나누면 나머지는 3	//60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time/60)/60;//몫 몫 0		//60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.print(time + "초는");
		System.out.print(hour + "시간,");
		System.out.print(minute + "분,");
		System.out.print(second + "초입니다.");
		
		scanner.close();
	}

}
