package ex01;

public class Exam04 {
	
	//1차원 배열 String
	public static void main(String[] args) {
		
		String[] myStr2 = {"kor","eng","math"};
		String[] myStr = new String[3];
		
		for(int i = 0; i < myStr.length;i++)
			System.out.println(myStr[i]);
		
		for(int i = 0; i < myStr2.length;i++)
			System.out.println(myStr2[i]);
	}

}
