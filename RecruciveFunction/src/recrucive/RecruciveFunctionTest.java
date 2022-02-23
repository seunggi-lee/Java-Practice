package recrucive;

import java.util.Scanner;

public class RecruciveFunctionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(recruciveFunction(num));
		
		
	}
	public static int recruciveFunction(int num) {
		if(num == 0) {
			return 1;
		}
		else
			return recruciveFunction(num - 1) * num;
		
	}

}
