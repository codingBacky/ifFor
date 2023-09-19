package ex01;

//재귀 호출문
public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println(add(1,3));
		System.out.println(add(1,3,5));
		System.out.println(add(1.3,3.1,5.5));
		//System.out.printf("%.2f\n",add(1.3,3.1,5.5));
		
	}
	
	static int add(int n1, int n2) {
		return n1+n2;
	}
	static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	static int add(double n1, double n2, double n3) {
		return (int)(n1+n2+n3);
	}
//	static double add(double n1, double n2, double n3) {
//		return n1+n2+n3;
//	}
}
