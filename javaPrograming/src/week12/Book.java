package week12;

public class Book { //Book 클래서 생성
	String title; //title 문자열 선언
	String author;//authoy 문자열 선언
	
	public Book(String t) { 
		title = t; author = "작자미상";
	}
	public Book(String t, String a) {//String t, String a
		title = t; author = a;//title은 t 넣고, author은 a에 넣음
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자","생텍쥐페리"); //littleprince라는 어린왕자, 생텍쥐페리를 새로운 Book생성자 10번 줄에 문자열 t,a를 찾아감
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title+" " + loveStory.author);
	}

}
