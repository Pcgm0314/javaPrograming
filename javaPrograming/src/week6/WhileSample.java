package week6;
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0; //int(정수타입) count(변수)는 입력된 정수의 개수
		int sum=0; //sum은 합
		Scanner scanner = new Scanner(System.in);//스캐너에서 시스템 인에 입력을 받음
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt();//다음에 값 가져오는데 정수형 가져와라 nextInt
		while(n != -1) { //-1이 입력되면 while문 벗어남
			sum+=n;
			count ++;
			n=scanner.nextInt();
		}
		{if(count == 0) 
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는"+count+"개이며");
			System.out.println("평균은"+(double)sum/count +"입니다.");
			}
		}
		scanner.close();
	}

}
