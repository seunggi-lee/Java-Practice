package interfaceex;

public class CompleteCalc extends Calculator {//자바에서는 하나만 구현 extends가능이지만 implements를 사용하면 여러개를 이용 가능

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 /num2;
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}

	@Override
	public void description() {// 인터페이스에서 default를 붙여서 구현을 했어도 오바라이드가 가능하다
		System.out.println("완벽한 계산기");
	}
	

}
