package ex01;

public class Exam08 {
	
	public static void main(String[] args) {
		
		//입력받은 데이터 오름차순
		//sort 사용하지 않고 사용하기
		int[] stuScore = new int[5];


		for(int i = 0; i < 5; i++) {
			stuScore[i] = (int)(Math.random()*100+1);
			System.out.println(stuScore[i]);
		}
		System.out.println("----------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {
				int tmp = 0;
				if(stuScore[i]>stuScore[j])	{
					tmp = stuScore[i];
					stuScore[i] = stuScore[j];
					stuScore[j] = tmp;
				}
			}
		}
		/*
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-1; j++) {
				int tmp = 0;
				if(stuScore[j]>stuScore[j+1])	{
					tmp = stuScore[j];
					stuScore[j] = stuScore[j+1];
					stuScore[j+1] = tmp;
				}
			}
		}*/
		
		for(int i = 0; i <5; i ++) {
				System.out.println(stuScore[i]);	
			
		}
		//입력받은 데이터 내림차순
		for(int i = 0; i < stuScore.length; i++) {
			for(int j = i + 1; j < stuScore.length; j++) {
				int tmp = 0;
				if(stuScore[i]<stuScore[j]) {
					tmp = stuScore[i];
					stuScore[i] = stuScore[j];
					stuScore[j] = tmp;
				}
			}
		}

		for(int i = 0; i < stuScore.length; i++) {
			System.out.println(stuScore[i]);
		}

	}

}
