package week9;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//new새로운 scanner
		
		int intArray[] = new int[5];//배열 생성 배열되는 변수 []사용 new int 새로운 자료형 [5]개 공간

		int max = 0;	//현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i<5; i++) {
			intArray[i] = scanner.nextInt();//입력받은 정수를 배열에 저장
			if(intArray[i]>max)//intArray[i]가 현재 가장 큰 수보다 크면
				max = intArray[i];//intArray[i]를max로 변경
		}
			System.out.print("가장 큰 수는"+max+"입니다.");
			
			scanner.close();
	}

}
