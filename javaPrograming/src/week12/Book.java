package week12;

public class Book { //Book 클래서 생성
	String title; //title 문자열 선언
	String author;//authoy 문자열 선언
	
	public Book(String t) {
		title = t; author = "작자미상";
	}
	public Book(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자","생텍쥐페리"); //
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title+" " + loveStory.author);
	}

}
