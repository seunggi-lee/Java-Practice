package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		
//		int[] numbers = new int[] {0,1,2}; //�ʱ�ȭ ���
		//int[] numbers = new int[3] {0,1,2}; //���� �߻�
//		
		int[] numbers = new int[3];
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[0] = 1;
		
		//System.out.println(numbers.length);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
