package ex02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
	
		for(int i = 5; i < 51; i += 5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i = 66; i <79; i += 2) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt()+1;
		sum = 0;
		for(int i = 1; i < num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for(int i = 2; i < 31; i +=2 ) {
			if(i % 6 == 0)
				System.out.print(i + "\n");
			else System.out.print(i+" ");
		}
		
		sum = 0;
		for(int i = 1; i < 11; i++) {
			if(i%2 == 0) sum -=i;
			else sum +=i;
		}
		System.out.println(sum);
		
		for(int i = 1; i <11; i++) {
			if(i%3 == 0) 
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		int count = 0;
		sum = 0;
		for(int i = 100; i < 1000; i++) {
			if(i%7 == 0) {count++; sum += i;};
		}
		System.out.println("7의 배수 갯수 :" + count);
		System.out.println("7의 배수 합 :" + sum);
		
		
		count = 0;
		sum = 0;
		for(int i = 100; i < 1000; i++) {
			if(i%4 != 0) {count++; sum += i;};
		}
		System.out.println("갯수 :" + count);
		System.out.println("합 :" + sum);
		
		int even = 0;
		int odd = 0;
		for(int i = 1; i < 31; i++) {
			if(i%2 == 0) even += i;
			odd += i;
		}
		System.out.println("짝수합" + even);
		System.out.println("홀수합" + odd);
	}

}
