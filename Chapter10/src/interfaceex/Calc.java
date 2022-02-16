package interfaceex;

public interface Calc {
	
	double PI = 3.14; // public static final �� ���� �ʾƵ� �⺻������ ���� ��
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {//�������̽��̹Ƿ� �޼ҵ带 ���� �� ���⶧���� default�� ������ �ȵ�
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	static int total(int[] arr) { // static�� ����ϸ� �������̽������� ������ �����ϴ�
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
