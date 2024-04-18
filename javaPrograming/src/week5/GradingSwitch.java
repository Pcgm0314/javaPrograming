package week5;

import java.util.Scanner;


public class GradingSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner=new Scanner(System.in); //시스템 입력 in받는다
		
		String grade;
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		switch(score/10) { //score 값을 10으로 나누기
		case 10://case가 score/10 식에 맞게 해서 실행 후 grade에 결과값
		case 9:
			grade ="A";//나눴을때 10이나 9이면 이렇게 출력
			break;//중간에 빠져 나오는거
		case 8:
			grade="B";
			break;
		case 7:
			grade="c";
			break;
		case 6:
			grade="D";
			break;
		default://case ? 이외의 값이 나올때 else와 같은 의미로 값 출력
			grade="F";
		}
		System.out.println("학점은"+grade+"입니다");//out 시스템 출력 학점은 A 입니다
		scanner.close();

	}

}
