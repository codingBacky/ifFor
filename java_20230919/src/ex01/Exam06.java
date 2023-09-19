package ex01;

public class Exam06 {
	
	public static void main(String[] args) {
		
		//5명 학생 점수를 입력받는다.
		//최대값, 최소값 출력
		int[] stuScore = new int[5];
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < 5; i++) {
			stuScore[i] = (int)(Math.random()*100+1);
			System.out.println(stuScore[i]);
			
			if(stuScore[i]>max) 
				max = stuScore[i];
			
			if(stuScore[i]<min) 
				min = stuScore[i];
		}

		System.out.println("최대값 : " + max);	
		System.out.println("최소값 : " + min);	
		
	}

}
