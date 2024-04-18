package week6;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ='a';
		
		do {
			System.out.print(c);
			c=(char)(c+1);
		}while(c <= 'z');//char은 글자를 작다 크다 비교 가능한데 String은 안됨

	}

}
