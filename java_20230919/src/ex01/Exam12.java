package ex01;

public class Exam12 {
	
	public static void main(String[] args) {
		int[] numA = new int[10];
		int[] count = new int[10];
		
		for(int i = 0; i < numA.length; i++) {
			numA[i] = (int)(Math.random()*10);
			System.out.print(numA[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i < numA.length; i++) {
			/*for(int j = 0; j < numA.length; j++) {
			if(numA[i] == j)
				count[j]++;
			}*/
			count[numA[i]]++;
		}
		for(int i = 0; i< numA.length; i++)
			System.out.println(i + "의 개수 : " + count[i]);
		}
	
}
