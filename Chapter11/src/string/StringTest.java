package string;

public class StringTest {

	public static void main(String[] args) {
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1 == str2); // 위와 같은 방식으로 생성하면 각자 고유한 힙 메모리에 abc가 생성되는 것이고
//		
//		String str3 = "abc";
//		String str4 = "abc";
//		
//		System.out.println(str3 == str4); // 위처럼 생성을 하면 abc라는 상수의 주소를 두가지 모두 동일하게 가리키기 때문에 나오는 현상
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		str1 = str1.concat(str2); // string은 불변이기 때문에 
		
		System.out.println(str1); // 단지 새로운 문자열의 주소를 가리키는 것일 뿐이다
	}

}
