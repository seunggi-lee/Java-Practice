package interfaceex;

public interface Calc {
	
	double PI = 3.14; // public static final 을 쓰지 않아도 기본적으로 적용 됨
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {//인터페이스이므로 메소드를 가질 수 없기때문에 default가 없으면 안됨
		System.out.println("정수 계산기를 구현합니다.");
	}
	static int total(int[] arr) { // static을 사용하면 인터페이스에서도 구현이 가능하다
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
