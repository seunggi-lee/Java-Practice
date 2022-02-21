package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		Calc calc = new CompleteCalc();
		// calc.showInfo ~~ //이 방법은 불가능하다 왜냐하면 showInfo는 CompleteCal~에서 구현된건다 calc의 타입은 Calc이기 때문이다.
		// 즉, Calc에서 showInfo관련된 메소드를 선언 및 구현한 적이 없기 때문이다.
		
		
		
		System.out.println(calc.add(num1, num2));
		calc.description(); // 인터페이스에서 구현한 것인데 default를 붙였기 때문에 사용 가능
		int[] arr= {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
