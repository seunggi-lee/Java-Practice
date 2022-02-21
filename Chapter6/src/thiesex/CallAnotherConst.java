package thiesex;

class Person{
	String name;
	int age;
	
	public Person() {
//		name = "이름없음";
//		age = 1;
		this("이름없음", 1);  // 같다 위와
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
