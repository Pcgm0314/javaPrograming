package week10;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3, 3.4},
				{3.5, 3.6},
				{3.7,4.0},
				{4.1, 4.2}};
		double sum=0; //double 소수점
		
		for(int year = 0; year<score.length; year++) {//각 학년 별로 반복 3
			for(int term=0;term<score[year].length;term++) {//각 학년의 학기별로 반복 2
				sum += score[year][term];//전체 평점 합
				}
			}
		int n = score.length;//배열 행 개수 4
		int m = score[0].length;//배열의 열 개수 2
		System.out.println("4년 전체 평점 평균은"+sum/(n*m));
		}
	}