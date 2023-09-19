package ex01;

//재귀 호출을 이용한 팩토리얼 구현
public class Exam15 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("result : " + result);
	}
	/*
	 * static int factorial(int num) { if( num==1 ) return 1;
	 * 
	 * return num * factorial( num-1 ); }
	 */
	
	static int factorialTail(int num, int acc) {
		if(num == 1) return acc;
	    return factorialTail(num - 1, acc * num);
		}
	
	static int factorial(int num){
		return factorialTail(num, 1);
	}

}
