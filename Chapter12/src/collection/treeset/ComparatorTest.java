package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{ // ������ String�� �̿��Ͽ� ��Ģ�� �ٲٰ� ���� �� �ϴ� ���

	@Override
	public int compare(String str1, String str2) { // compare�Լ��� �������̵� �ؼ� ����ؾ���
		return str1.compareTo(str2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>(new MyCompare());// ������ ���� ������ ���Ѵ�� �ϱ� ���ؼ��� �����ڸ� �Է��ؾ���
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
