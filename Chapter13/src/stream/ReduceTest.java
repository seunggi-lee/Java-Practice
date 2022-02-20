package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		
		if(s1.getBytes().length>= s2.getBytes().length)
			return s1;
		else return s2;
	}
}


public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~~~", "helli","good morning","ㅎㅇ"};
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2)->{ // 직접 람다로 만들어서 비교해도 되고
			if(s1.getBytes().length>= s2.getBytes().length)
				return s1;
			else return s2;}
				));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); // CompareString 클래스를 구현해서 만들 수 도 있다.
		System.out.println(str);
	}

}
