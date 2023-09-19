package ex01;

public class Exam09 {
	
	public static void main(String[] args) {
		
		//입력받은 데이터 오름차순
		//sort 사용하지 않고 사용하기
		int[] stuScore = new int[5];
		boolean flag = false;


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
					flag = true;
				}
			}
			if(!flag) break;//바뀐게 없으면 정렬이 필요 없으므로 반복문을 빠져나온다
		}
	
		for(int i = 0; i < stuScore.length; i++) {
			System.out.println(stuScore[i]);
		}

	}

}
