package thiesex;

class Person{
	String name;
	int age;
	
	public Person() {
//		name = "�̸�����";
//		age = 1;
		this("�̸�����", 1);  // ���� ����
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
		
	}

}
