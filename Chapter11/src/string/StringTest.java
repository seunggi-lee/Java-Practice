package string;

public class StringTest {

	public static void main(String[] args) {
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1 == str2); // ���� ���� ������� �����ϸ� ���� ������ �� �޸𸮿� abc�� �����Ǵ� ���̰�
//		
//		String str3 = "abc";
//		String str4 = "abc";
//		
//		System.out.println(str3 == str4); // ��ó�� ������ �ϸ� abc��� ����� �ּҸ� �ΰ��� ��� �����ϰ� ����Ű�� ������ ������ ����
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		str1 = str1.concat(str2); // string�� �Һ��̱� ������ 
		
		System.out.println(str1); // ���� ���ο� ���ڿ��� �ּҸ� ����Ű�� ���� ���̴�
	}

}
