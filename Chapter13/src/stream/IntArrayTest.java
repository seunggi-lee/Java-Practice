package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
//		int sum = Arrays.stream(arr).sum(); // 한번 사용된 스트림은 사용불가능, 다시 생성 해서 사용해야한다.
//		System.out.println(sum);
	}

}
