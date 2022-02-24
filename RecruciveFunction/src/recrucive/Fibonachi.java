package recrucive;

import java.util.Scanner;

public class Fibonachi {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(fibonachiFunc(input));
	}
	
	static int fibonachiFunc(int input) {
		
		if(input < 2) {
			return input;
		}
		else return fibonachiFunc(input - 2) + fibonachiFunc(input - 1);
	}
}
