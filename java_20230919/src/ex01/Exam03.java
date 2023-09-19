package ex01;

public class Exam03 {

	//1-45 로또번호 난수 구하기
	public static void main(String[] args) {
		int[] myArr = new int[5];
		
		for(int i = 0; i < myArr.length; i++ ) {
			myArr[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}

}
