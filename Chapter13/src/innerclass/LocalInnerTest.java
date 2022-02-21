package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	
	public Runnable getRunnable() {
		int localNum = 100;
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//outNum+= 100;//���� x, �ֳ��ϸ� outNum�� ���������� �ƴ� �ν��Ͻ� �����̱� �����̴�
				//localNum+= 100; // localNum�� ���������μ�  final ����μ� ���ÿ� ����Ǳ� ������ �Һ��̴�. �׷��� ������ ������ �߻��Ѵ�. 
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
	}

}
