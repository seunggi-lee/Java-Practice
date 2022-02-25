package thtn;

import java.util.ArrayList;
import java.util.Scanner;

public class thtnTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			int inputValue = sc.nextInt();
			boolean isTrue = true;
			
			if(inputValue == 1)
				continue;
			else {
				int value = 2;
				while(value != inputValue) {
					if(inputValue % value == 0) {
						value = inputValue;
						isTrue = false;
					}
					else {
						value++;
					}
				}
				
			}
			if(isTrue == true)
				al.add(inputValue);
		}
			System.out.print(al.size());
		}
	}


