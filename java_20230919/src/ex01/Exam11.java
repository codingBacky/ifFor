package ex01;

public class Exam11 {
	
	public static void main(String[] args) {
		
		//로또 번호 1 ~ 45 중 중복되지 않는 숫자 6개 찾기 기존 값과 중복이 되는지 체크하고 중복되면 새로뽑기
		//1 ~ 45번의 숫자를 섞어서 오른쪽에서 6개 추출
		int[] num = new int[45];
		System.out.print("원데이터 : ");
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		System.out.print(num[i]+ " ");
		}
		for(int i = 0; i < 1000; i++) {
			int n = (int)(Math.random()*45);
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
			
			
		
		}
		System.out.println("\n이번주 번호 : ");
		for(int i = 0; i < 6; i++)
			System.out.print(num[i]+" ");
	}
}
