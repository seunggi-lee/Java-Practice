package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		Calc calc = new CompleteCalc();
		// calc.showInfo ~~ //�� ����� �Ұ����ϴ� �ֳ��ϸ� showInfo�� CompleteCal~���� �����ȰǴ� calc�� Ÿ���� Calc�̱� �����̴�.
		// ��, Calc���� showInfo���õ� �޼ҵ带 ���� �� ������ ���� ���� �����̴�.
		
		
		
		System.out.println(calc.add(num1, num2));
		calc.description(); // �������̽����� ������ ���ε� default�� �ٿ��� ������ ��� ����
		int[] arr= {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
