package thtn;

import java.util.ArrayList;
import java.util.Scanner;

public class thtnTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int minNum = sc.nextInt();
		int maxNum = sc.nextInt();
		int sum = 0;
		x : for(int i = minNum; i <= maxNum; i++) {
			boolean isTrue = true;
			if(i == 1) {
				continue;
			}
			for(int j = 2; j<i; j++) {
				if(i % j == 0) {
					isTrue = false;
					continue x;
				}
			}
			if(isTrue == true)
				al.add(i);
		}
		if(al.size() == 0) {
			System.out.println(-1);
		}
		else {
			for(Integer i : al) {
				 sum += i;
			}
			System.out.println(sum);
			System.out.println(al.get(0));
		}
		
	}
}	
				


