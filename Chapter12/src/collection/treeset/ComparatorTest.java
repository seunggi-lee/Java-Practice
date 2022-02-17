package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{ // 정렬을 String을 이용하여 규칙을 바꾸고 싶을 때 하는 방법

	@Override
	public int compare(String str1, String str2) { // compare함수를 오버라이딩 해서 사용해야함
		return str1.compareTo(str2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>(new MyCompare());// 정렬을 내가 위에서 정한대로 하기 위해서는 생성자를 입력해야함
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
