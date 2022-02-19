package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	
	public Runnable getRunnable() {
		int localNum = 100;
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//outNum+= 100;//오류 x, 왜냐하면 outNum은 지역변수가 아닌 인스턴스 변수이기 때문이다
				//localNum+= 100; // localNum은 지역변수로서  final 상수로서 스택에 저장되기 때문에 불변이다. 그렇기 때문에 오류가 발생한다. 
				
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
