package ex01;

import java.util.Arrays;

public class Exam07 {
	
	public static void main(String[] args) {
		
		//입력받은 데이터 오름차순
		int[] stuScore = new int[5];

		int min = 100;

		for(int i = 0; i < 5; i++) {
			stuScore[i] = (int)(Math.random()*100+1);
			System.out.println(stuScore[i]);
		}
		Arrays.sort(stuScore);
		System.out.println(Arrays.toString(stuScore));	


	}

}
