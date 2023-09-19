package ex01;

public class Exam05 {
	
	public static void main(String[] args) {
		
		//랜덤을 이용해서 5명 학생 점수를 입력받는다.
		//5명 점수 총점과 평균을 구한다.
		int[] sutScore = new int[5];
		int total = 0;
		double avg = 0;
		for(int i = 0; i < 5; i++) {
			sutScore[i] = (int)(Math.random()*100+1);
			System.out.println(sutScore[i]);
			total += sutScore[i];
		}
		
		avg = (double)total/5;
		System.out.println("총점 : " + total);	
		System.out.printf("평균 : %.2f", avg);	
		
	}

}
