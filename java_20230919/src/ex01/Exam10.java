package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exam10 {
	
	public static void main(String[] args) {
		
		//로또 번호 1 ~ 45 중 중복되지 않는 숫자 6개 찾기 기존 값과 중복이 되는지 체크하고 중복되면 새로뽑기
		int[] num = new int[6];
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			num[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++)
			{
				if(num[i]==num[j])
					i--;
			}
		}
		for(int value:num) {
			list.add(value);
		}
		System.out.println(list);
		
		
		
		//set의 중복 허용하지 않는 특성을 이용
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<7) {
			int a = (int)(Math.random()*45+1);
			set.add(a);
		}
		System.out.println(set);
	}
}
