package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int sum = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(sum);
	}

}
