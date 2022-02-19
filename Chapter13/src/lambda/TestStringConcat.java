package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConcaImpl sImpl = new StringConcaImpl();
		sImpl.makeString("hello", "java");
		
		StringConcat concat = (s1,s2) -> System.out.println(s1 + " " + s2); // хн╬ю ╟ё╢э
		concat.makeString("hello", "java");
	}

}
